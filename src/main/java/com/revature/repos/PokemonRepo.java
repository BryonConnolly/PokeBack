package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Pokemon;
@Repository
public interface PokemonRepo extends JpaRepository<Pokemon, Integer> {

}
