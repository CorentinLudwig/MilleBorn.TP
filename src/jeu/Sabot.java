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
	
	public void ajouterCarte(Cartes carte ) {
		
	}
}
