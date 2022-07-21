package br.com.digix.pokedigix.pokemon;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Pokemon.Pokemon;

public class PokemonTest {

    @Test
    public void deve_poder_criar_um_pokemon() {
        Long idEsperado = 1L;
        String nomeEsperado = "Pikachu";
        int nivelEsperado = 100;
        int felicidadeEsperada = 100;
        String tipoEsperado = "Elétrico";
        double alturaEsperada = 0.40;
        double pesoEsperado = 6.00;
        String generoEsperado = "Masculino";
        int numeroPokedexEsperado = 25;
        String treinadorEsperado = "EnzoEletropau";

        Pokemon pokemon = new Pokemon(nomeEsperado, nivelEsperado, felicidadeEsperada, tipoEsperado, alturaEsperada, pesoEsperado, generoEsperado, numeroPokedexEsperado, treinadorEsperado);

        assertEquals(nomeEsperado, pokemon.getNome());
        assertEquals(nivelEsperado, pokemon.getNivel());
        assertEquals(felicidadeEsperada, pokemon.getFelicidade());
        assertEquals(tipoEsperado, pokemon.getTipo());
        assertEquals(alturaEsperada, pokemon.getAltura());
        assertEquals(pesoEsperado, pokemon.getPeso());
        assertEquals(generoEsperado, pokemon.getGenero());
        assertEquals(numeroPokedexEsperado, pokemon.getNumeroPokedex());
        assertEquals(treinadorEsperado, pokemon.getTreinador());
    }
}
