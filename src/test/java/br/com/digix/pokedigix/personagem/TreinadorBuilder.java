package br.com.digix.pokedigix.personagem;

import br.com.digix.pokedigix.Pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.Pokemon.NivelMaiorException;
import br.com.digix.pokedigix.Pokemon.NivelMenorException;
import br.com.digix.pokedigix.Pokemon.Pokemon;
import br.com.digix.pokedigix.pokemon.PokemonBuilder;

public class TreinadorBuilder {

    private String nome;
    private Endereco endereco;
    private Pokemon pokemon;

    public TreinadorBuilder() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        this.nome = "Enzo";
        this.endereco = new EnderecoBuilder().construir();
        this.pokemon = new PokemonBuilder().construir();
    }

    public Treinador construir() {
        return new Treinador(endereco, nome, pokemon);
    }

    public TreinadorBuilder comPokemonInicial(Pokemon pokemonInicial) {
        this.pokemon = pokemonInicial;
        return this;
    }
}
