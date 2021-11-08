package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pokemon {
	@Id
	@SequenceGenerator(name = "poke_seq", sequenceName = "poke_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poke_seq")
	private int pokeId;
	private int pokedexId;
	private String name;
	private int baseXP;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Trainer trainer;
	public Pokemon(int pokeId, int pokedexId, String name, int baseXP, Trainer trainer) {
		super();
		this.pokeId = pokeId;
		this.pokedexId = pokedexId;
		this.name = name;
		this.baseXP = baseXP;
		this.trainer = trainer;
	}
	public Pokemon(int pokedexId, String name, int baseXP, Trainer trainer) {
		super();
		this.pokedexId = pokedexId;
		this.name = name;
		this.baseXP = baseXP;
		this.trainer = trainer;
	}
	public Pokemon() {
		super();
	}
	@Override
	public String toString() {
		return "Pokemon [pokeId=" + pokeId + ", pokedexId=" + pokedexId + ", name=" + name + ", baseXP=" + baseXP
				+ ", trainer=" + trainer + "]";
	}
	public int getPokeId() {
		return pokeId;
	}
	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}
	public int getPokedexId() {
		return pokedexId;
	}
	public void setPokedexId(int pokedexId) {
		this.pokedexId = pokedexId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseXP() {
		return baseXP;
	}
	public void setBaseXP(int baseXP) {
		this.baseXP = baseXP;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
}
