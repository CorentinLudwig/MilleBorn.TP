package testsFonctionnels;

import java.util.Iterator;

import cartes.Attack;
import cartes.Botte;
import cartes.Cartes;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;

public class TestSabot {
	
	public static void main(String[] args) {
		Sabot sb = new Sabot(10);

		sb.ajouterFamilleCarte(
				new Attack(3, Type.ACCIDENT),
				new Parade(6, Type.ACCIDENT),
				new Botte(1, Type.ACCIDENT)
				);
		
		for (int i = 0; i < 6; i++) {
			System.out.println(sb.piocher());
			
		}
	}
	

}
