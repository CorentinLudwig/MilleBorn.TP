package cartes;

import java.util.ArrayList;
import java.util.List;

import cartes.Probleme.Type;

public class JeuDeCartes {
	private Cartes[] typesDeCartes = new Cartes[] {
			new Botte(1,Type.ACCIDENT),
			new Botte(1,Type.FEU),
			new Botte(1,Type.CREVAISON),
			new Botte(1,Type.ESSENCE),
			
			new Attack(3,Type.ACCIDENT),
			new Attack(5,Type.FEU),
			new Attack(3,Type.CREVAISON),
			new Attack(3,Type.ESSENCE),
			
			new Parade(6,Type.ACCIDENT),
			new Parade(14,Type.FEU),
			new Parade(6,Type.CREVAISON),
			new Parade(6,Type.ESSENCE),
			
			new Borne(10,25),
			new Borne(10,50),
			new Borne(10,75),
			new Borne(12,100),
			new Borne(4,200),
			
			new FinLimite(6),
			new DebutLimite(4)
	};
	
	private List<Cartes> listCartes = new ArrayList<>();
	
	public JeuDeCartes() {
		
		for(Cartes cartes : typesDeCartes) {
			
		}


	}
	
//	
//	
//	public boolean checkCount() {
//		
//	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		
		for (int i = 0; i < jeu.typesDeCartes.length; i++) {
			System.out.println(jeu.typesDeCartes[i]);
		}
		
	}
}
