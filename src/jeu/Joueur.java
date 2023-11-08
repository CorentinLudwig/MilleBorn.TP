package jeu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.FinLimite;
import cartes.Limite;
import cartes.Probleme.Type;

public class Joueur {
	private String nom;
	private List<Limite> pileLimite = new ArrayList<>();
	private List<Bataille> pileBataille = new ArrayList<>();
	private List<Borne> pileBorne = new ArrayList<>();
	private Set<Botte> bottes = new HashSet<>();
	private MainAsListe main = new MainAsListe();
	
	
	
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public MainAsListe getMain() {
		return main;
	}
	public List<Limite> getPileLimite() {
		return pileLimite;
	}
	public List<Bataille> getPileBataille() {
		return pileBataille;
	}
	public List<Borne> getPileBorne() {
		return pileBorne;
	}
	public Set<Botte> getBottes() {
		return bottes;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (obj instanceof Joueur joueur2) {
			return joueur2.getNom() == this.getNom();
		}
		return super.equals(obj);
		
	}
	
		
		
	@Override
	public String toString() {
		return this.getNom();
	}

		
	public void donner(Carte carte) {
		main.prendre(carte);
	}
		
		
	public Carte prendreCarte(List<Carte> sabot) {
		if(sabot.isEmpty()) {
			return null;
		}
		Carte carte = sabot.get(0);
		donner(carte);
		return carte;
	}
		
	
	public int getKM() {
		int km = 0;
		for (Borne borne : pileBorne) {
			km += borne.getKm();
		}
		
		return km;
	}
		
	public int getLimite() {
		
		if(pileBataille.isEmpty()) {
			return 200;
		}
		
		if(bottes.contains(new Botte(1,Type.FEU))) {
			return 200;
		}
		
		Limite limite = pileLimite.get(pileLimite.size()-1);
		
		if (bottes instanceof FinLimite) {
			return 200;
		}
		
		return 50;
		
	}
		
		
	public static void main(String[] args) {
		Joueur joueur = new Joueur("bob");
		List<Carte> sabot = new ArrayList<>();
		
		joueur.prendreCarte(sabot);
	}
		
		
		
		
		
		
		
		
		
		
		
	
}
