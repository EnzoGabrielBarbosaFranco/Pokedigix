package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.Pokemon.NivelMaiorException;
import br.com.digix.pokedigix.Pokemon.NivelMenorException;
import br.com.digix.pokedigix.Pokemon.Pokemon;
import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonTest {

    @Test
    public void deve_poder_criar_um_pokemon() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        String nomeEsperado = "Pikachu";
        int nivelEsperado = 100;
        int felicidadeEsperada = 100;
        double alturaEsperada = 0.40;
        double pesoEsperado = 6.00;
        String generoEsperado = "Masculino";
        int numeroPokedexEsperado = 25;
        String treinadorEsperado = "EnzoEletropau";
        List<Tipo> tipos = new ArrayList<>();
        tipos.add(new Tipo("Elétrico"));

        Pokemon pokemon = new Pokemon(nomeEsperado, nivelEsperado, felicidadeEsperada, alturaEsperada, pesoEsperado,
                generoEsperado, numeroPokedexEsperado, treinadorEsperado, tipos, null);

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
    public void deve_cadastrar_um_tipo_para_o_pokemon() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        Tipo tipo = new Tipo("Elétrico");

        Pokemon pokemon = new PokemonBuilder().comTipo(tipo).construir();

        assertTrue(pokemon.getTipos().contains(tipo));
    }

    @Test
    public void deve_ter_no_nivel_minimo_um() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        int nivelMinimo = 1;
        Pokemon pokemon = new PokemonBuilder().comNivel(nivelMinimo).construir();

        assertEquals(nivelMinimo, pokemon.getNivel());
    }

    @Test
    public void deve_ter_no_nivel_maximo_cem() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        int nivelMaximo = 100;
        Pokemon pokemon = new PokemonBuilder().comNivel(nivelMaximo).construir();

        assertEquals(nivelMaximo, pokemon.getNivel());
    }

    @Test
    public void nao_pode_ter_nivel_menor_que_um() {
        int nivelMenor = 0;
        assertThrows(NivelMenorException.class, () -> {
            new PokemonBuilder().comNivelMenor(nivelMenor).construir();
        });
    }

    @Test
    public void nao_pode_ter_nivel_maior_que_cem() {
        int nivelMaior = 101;
        assertThrows(NivelMaiorException.class, () -> {
            new PokemonBuilder().comNivelMaior(nivelMaior).construir();
        });
    }

    @Test
    public void deve_ter_felicidade_minima_zero() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        int felicidadeMinima = 0;
        Pokemon pokemon = new PokemonBuilder().comFelicidade(felicidadeMinima).construir();

        assertEquals(felicidadeMinima, pokemon.getFelicidade());
    }

    @Test
    public void deve_ter_felicidade_maxima_cem() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException{
        int felicidadeMaxima = 100;
        Pokemon pokemon = new PokemonBuilder().comFelicidade(felicidadeMaxima).construir();

        assertEquals(felicidadeMaxima, pokemon.getFelicidade());
    }

    @Test
    public void nao_pode_ter_felicidade_menor_que_zero() {
        int feliciadeInvalida = -1;
        assertThrows(FelicidadeInvalidaException.class, () -> {
            new PokemonBuilder().comFelicidade(feliciadeInvalida).construir();
        });
    }
    @Test
    public void nao_pode_ter_felicidade_maior_que_cem() {
        int feliciadeInvalida = 101;
        assertThrows(FelicidadeInvalidaException.class, () -> {
            new PokemonBuilder().comFelicidade(feliciadeInvalida).construir();
        });
    }
}
