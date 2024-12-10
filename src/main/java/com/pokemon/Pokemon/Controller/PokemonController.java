package com.pokemon.Pokemon.Controller;

import com.pokemon.Pokemon.Model.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {
    @GetMapping("pokemon")
    public ResponseEntity<List<Pokemon>> getPokemons(){
        //ResponseEntity is used to include additional HTTP response details like status codes.
        List<Pokemon> pokemon = new ArrayList<>();
        pokemon.add(new Pokemon(1,"pika","electric"));
        pokemon.add(new Pokemon(2,"charmander","fire"));
        pokemon.add(new Pokemon(3,"squirtle","water"));
        return ResponseEntity.ok(pokemon);
    }
}
