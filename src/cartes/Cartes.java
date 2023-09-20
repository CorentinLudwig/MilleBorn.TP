package cartes;

public abstract class Cartes {
	private int nombre;

	protected Cartes(int nombre) {
		super();
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	
}
