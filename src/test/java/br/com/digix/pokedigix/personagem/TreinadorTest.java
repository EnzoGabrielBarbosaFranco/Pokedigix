package br.com.digix.pokedigix.personagem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Pokemon.Pokemon;
import br.com.digix.pokedigix.pokemon.PokemonBuilder;

public class TreinadorTest {
    
    @Test 
    public void deve_comecar_com_um_pokemon() {
        int quantidadeDePokemonsEsperada = 1;
        Pokemon pokemonInicial = new PokemonBuilder().construir();

        Treinador treinador = new TreinadorBuilder().comPokemonInicial(pokemonInicial).construir();

        assertTrue(treinador.getPokemons().contains(pokemonInicial));
        assertEquals(quantidadeDePokemonsEsperada, treinador.getPokemons().size());
    }

    @Test
    public void deve_poder_capturar_um_pokemon() throws LimiteDePokemonException {
        int quantidadeDePokemonsEsperada = 2;
        Pokemon pokemonACapturar = new PokemonBuilder().construir();

        Treinador treinador = new TreinadorBuilder().construir();

        treinador.capturar(pokemonACapturar);

        assertTrue(treinador.getPokemons().contains(pokemonACapturar));
        assertEquals(quantidadeDePokemonsEsperada, treinador.getPokemons().size());
    }

    @Test
    public void nao_pode_ter_mais_que_seis_pokemons_ao_mesmo_tempo() throws LimiteDePokemonException {
        Treinador treinador= new TreinadorBuilder().construir();
        for(int i = 1; i <= 5; i++) {
            treinador.capturar(new PokemonBuilder().construir());
        }

        assertThrows(LimiteDePokemonException.class, () -> {
            treinador.capturar(new PokemonBuilder().construir());
        });
    }    
}
