package com.pokemon.Pokemon.Controller;

import com.pokemon.Pokemon.Model.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        //ResponseEntity.ok(pokemon) is shorthand for returning a response with a 200 status and the pokemon list as the body.
        // A shortcut for creating a ResponseEntity with the given body and the status set to OK.
    }

    @GetMapping("/pokemon/{id}")
    //read the data from the client
    public Pokemon getId(@PathVariable("id") int id){
        //pathvariable is used to get the input data from the url path
        return new Pokemon(id,"name","type");
    }

    @PostMapping("/pokemon/create")
    //create a new data in the client
    public ResponseEntity<Pokemon> createPokemon(@RequestBody Pokemon pokemon){
        return new ResponseEntity<>(pokemon, HttpStatus.CREATED);
    }

    @PutMapping("/pokemon/{id}/update")
    public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") int id){
        return ResponseEntity.ok(pokemon);
    }

    @DeleteMapping("/pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int id){
        return ResponseEntity.ok("Pokemon Deleted");
    }
}
