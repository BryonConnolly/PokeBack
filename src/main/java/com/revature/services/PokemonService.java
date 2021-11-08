package com.revature.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Pokemon;
import com.revature.repos.PokemonRepo;
@Service
public class PokemonService {
	private PokemonRepo pokemonRepo;

	@Autowired
	public PokemonService(PokemonRepo pokemonRepo) {
		super();
		this.pokemonRepo = pokemonRepo;
	}
	
	public List<Pokemon> findAllPokemon(){
		return pokemonRepo.findAll();
	}
	public Optional<Pokemon> findPokemonById(int id){
		return pokemonRepo.findById(id);
	}
	
	@Transactional
	public void addPokemon(Pokemon pokemon) {
		pokemonRepo.save(pokemon);
	}

}
