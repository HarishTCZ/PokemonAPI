package com.pokemon.Pokemon.Repository;

import com.pokemon.Pokemon.Model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon,Integer> {
}
