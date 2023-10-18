package testsFonctionnels;

import cartes.JeuDeCartes;

public class TestJeuDeCartes {
	
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		
		for (int i = 0; i < jeu.getListCartes().size(); i++) {
			System.out.println(jeu.getListCartes().get(i));
		}
		
		System.out.println(jeu.checkCount());
		
	}
	
}
