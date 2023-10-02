package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Cartes;

public class Sabot implements Iterable<Cartes> {
	private Cartes[] tabCartes;
	private int nbCartes = 0;

	public Sabot(int tailleSabot) {
		tabCartes = new Cartes[tailleSabot];
	}

	public boolean estVide() {
		return nbCartes == 0;

	}

	public void ajouterCarte(Cartes carte) {
		if (nbCartes > tabCartes.length) {
			tabCartes[nbCartes] = carte;
			nbCartes++;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void ajouterFamilleCarte(Cartes carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}

	public void ajouterFamilleCarte(Cartes... cartes) {
		for (Cartes carte : cartes) {
			for (int i = 0; i < carte.getNombre(); i++) {
				ajouterCarte(carte);
			}
		}
	}
	
	@Override
	public Iterator<Cartes> iterator() {
		return new Iterateur();
	}
	
	public Cartes piocher() {
		Iterator<Cartes> ite = iterator();
		Cartes c = ite.next();
		ite.remove();
		return c;
	}
	
	
		private class Iterateur implements Iterator<Cartes> {
		private int indiceIterateur = 0;
		private int nombreOperationsReference = nbCartes;
		private boolean nextEffectue = false;
		
		
		public boolean hasNext() {
			verificationConcurrence();
			return indiceIterateur < nbCartes;
		}

		public Cartes next() {
			verificationConcurrence();
			if (hasNext()) {
				Cartes carte = tabCartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			verificationConcurrence();
			if (nextEffectue && nbCartes>1) {
				for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
					tabCartes[i] = tabCartes[i + 1];

				}
				nbCartes--;
				nombreOperationsReference --;
			} else {
				throw new IllegalStateException();
			}
		}
		
		private void verificationConcurrence() {
			if(nombreOperationsReference != nbCartes) {
				throw new ConcurrentModificationException();
			}
		}
	}
}

