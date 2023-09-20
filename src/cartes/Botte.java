package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		switch (super.getType()) {
		case FEU:
			return "V�HICULE PRIORITAIRE";
			
		case ESSENCE:
			return "CITERNE D�ESSENCE";
		
		case CREVAISON:
			return "INCREVABLE";
			
		case ACCIDENT:
			return "AS DU VOLANT";
			
		default :
			return "erreur";
		}	
		
	}
}
