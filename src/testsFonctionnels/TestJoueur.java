package testsFonctionnels;

import java.util.ArrayList;
import java.util.List;

import cartes.Borne;
import cartes.Carte;
import jeu.Joueur;

public class TestJoueur {
	
	public static void main(String[] args) {
		Joueur joueur = new Joueur("bob");
		Borne borne = new Borne(1, 50);
		List<Borne> listborne = joueur.getPileBorne();
		
		for (int i = 0; i < 5; i++) {
			listborne.add(borne);
		}
		
		System.out.println(joueur.getKM());
	}

}
