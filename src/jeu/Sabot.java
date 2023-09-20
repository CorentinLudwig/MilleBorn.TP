package jeu;


import cartes.Cartes;

public class Sabot {
	private Cartes[] tabCartes;
	private int nbCartes=0;
	
	
	public Sabot(int tailleSabot) {
		tabCartes = new Cartes[tailleSabot];
	}
	
	public boolean estVide() {
		return nbCartes==0;
		
	}
	
	public void ajouterCarte(Cartes carte) {
		if(nbCartes>tabCartes.length) {
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

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

