package br.com.digix.pokedigix.pokemon;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Pokemon.Pokemon;
import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonTest {

    @Test
    public void deve_poder_criar_um_pokemon() {
        Long idEsperado = 1L;
        String nomeEsperado = "Pikachu";
        int nivelEsperado = 100;
        int felicidadeEsperada = 100;
        double alturaEsperada = 0.40;
        double pesoEsperado = 6.00;
        String generoEsperado = "Masculino";
        int numeroPokedexEsperado = 25;
        String treinadorEsperado = "EnzoEletropau";
        List<Tipo> tipos = new ArrayList<>();
        tipos.add( new Tipo("Elétrico"));

        Pokemon pokemon = new Pokemon(nomeEsperado, nivelEsperado, felicidadeEsperada ,alturaEsperada, pesoEsperado, generoEsperado, numeroPokedexEsperado, treinadorEsperado, tipos);

        assertEquals(nomeEsperado, pokemon.getNome());
        assertEquals(nivelEsperado, pokemon.getNivel());
        assertEquals(felicidadeEsperada, pokemon.getFelicidade());
        assertEquals(tipos, pokemon.getTipos());
        assertEquals(alturaEsperada, pokemon.getAltura());
        assertEquals(pesoEsperado, pokemon.getPeso());
        assertEquals(generoEsperado, pokemon.getGenero());
        assertEquals(numeroPokedexEsperado, pokemon.getNumeroPokedex());
        assertEquals(treinadorEsperado, pokemon.getTreinador());
    }

    @Test 
    public void deve_cadastrar_um_tipo_para_o_pokemon() {
        String nomeEsperado = "Pikachu";
        int nivelEsperado = 100;
        int felicidadeEsperada = 100;
        double alturaEsperada = 0.40;
        double pesoEsperado = 6.00;
        String generoEsperado = "Masculino";
        int numeroPokedexEsperado = 25;
        String treinadorEsperado = "EnzoEletropau";
        List<Tipo> tipos = new ArrayList<>();
        tipos.add( new Tipo("Elétrico"));

        Pokemon pokemon = new Pokemon(nomeEsperado, nivelEsperado, felicidadeEsperada, alturaEsperada, pesoEsperado, generoEsperado, numeroPokedexEsperado, treinadorEsperado, tipos);

        assertEquals(nomeEsperado, pokemon.getNome());
        assertEquals(nivelEsperado, pokemon.getNivel());
        assertEquals(felicidadeEsperada, pokemon.getFelicidade());
        assertEquals(tipos, pokemon.getTipos());
        assertEquals(alturaEsperada, pokemon.getAltura());
        assertEquals(pesoEsperado, pokemon.getPeso());
        assertEquals(generoEsperado, pokemon.getGenero());
        assertEquals(numeroPokedexEsperado, pokemon.getNumeroPokedex());
        assertEquals(treinadorEsperado, pokemon.getTreinador());
    }
}
