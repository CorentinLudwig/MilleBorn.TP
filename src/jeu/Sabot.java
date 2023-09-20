package jeu;

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
		// TODO Auto-generated method stub
		return null;
	}

	private class Iterateur implements Iterator<Cartes> {
		private int indiceIterateur = 0;
		private int nombreOperationsReference = nbCartes;

		private boolean nextEffectue = false;

		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}

		public Cartes next() {
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
			if (nextEffectue && nbCartes>1) {
				for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
					tabCartes[i] = tabCartes[i + 1];

				}
				nbCartes--;
			} else {
				throw new IllegalStateException();
			}
		}
	}

}
