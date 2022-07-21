package br.com.digix.pokedigix.pokemon;

import br.com.digix.pokedigix.Pokemon.Pokemon;

import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository <Pokemon, Long> {
}
