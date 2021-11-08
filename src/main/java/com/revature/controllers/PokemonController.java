package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Pokemon;
import com.revature.services.PokemonService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PokemonController {
	
	private PokemonService pokemonservice;
	@Autowired
	public PokemonController(PokemonService pokemonservice) {
		super();
		this.pokemonservice=pokemonservice;
	}
	
	@GetMapping("/poke")
	public List<Pokemon> getAllPoke(){
		return pokemonservice.findAllPokemon();
	}
	@GetMapping("/poke/{id}")
	public Pokemon getPokeById(@PathVariable("id") int id){
		return pokemonservice.findPokemonById(id).get();
	}
	
	@PostMapping("/poke")
	public void addPokemon(@RequestBody Pokemon pokemon) {
		 pokemonservice.addPokemon(pokemon);
	}


}
