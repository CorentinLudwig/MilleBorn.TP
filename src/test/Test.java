package test;

import java.util.Iterator;

import cartes.Attack;
import cartes.Botte;
import cartes.Cartes;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;

public class Test {
	
	public static void main(String[] args) {
		
		Sabot sab = new Sabot(10);
		sab.ajouterFamilleCarte(
				new Attack(3, Type.ACCIDENT),
				new Parade(3, Type.ACCIDENT),
				new Botte(1, Type.ACCIDENT)
				);
		
		
		Iterator<Cartes> ite = sab.iterator();
		while(ite.hasNext()) {
			System.out.println(sab.piocher());
		}
	}

}
