package cartes;

public class Borne extends Cartes {
	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	
	public int getKm() {
		return km;
	}
	
	@Override
	public String toString() {
		StringBuilder str= new StringBuilder();;
		str.append(km);
		str.append("km");
		return str.toString();
	}
}
