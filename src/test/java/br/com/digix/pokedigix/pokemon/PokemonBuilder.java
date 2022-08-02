package br.com.digix.pokedigix.pokemon;

import java.util.ArrayList;
import java.util.Collection;

import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.Pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.Pokemon.NivelMaiorException;
import br.com.digix.pokedigix.Pokemon.NivelMenorException;
import br.com.digix.pokedigix.Pokemon.Pokemon;
import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonBuilder {

    private Collection<Ataque> ataques ;
    private String nomeEsperado;
    private int nivelEsperado;
    private int felicidadeEsperada;
    private double alturaEsperada;
    private double pesoEsperado;
    private String generoEsperado;
    private int numeroPokedexEsperado;
    private String treinadorEsperado;
    private Collection<Tipo> tipos;

    public PokemonBuilder() {
        this.nomeEsperado = "Pikachu";
        this.nivelEsperado = 100;
        this.felicidadeEsperada = 100;
        this.alturaEsperada = 0.40;
        this.pesoEsperado = 6.00;
        this.generoEsperado = "Masculino";
        this.numeroPokedexEsperado = 25;
        this.treinadorEsperado = "EnzoEletropau";
        this.tipos = new ArrayList<>();
        this.ataques = new ArrayList<>();
    }

    public PokemonBuilder comAtaque(Ataque ataque) {
        this.ataques.add(ataque);
        return this;
    }
    public Pokemon construir() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        return new Pokemon(nomeEsperado, nivelEsperado, felicidadeEsperada, alturaEsperada, pesoEsperado, generoEsperado, numeroPokedexEsperado, treinadorEsperado, tipos, ataques);
    }
    public PokemonBuilder comTipo(Tipo tipo) {
        this.tipos.add(tipo);
        return this;
    }

    public PokemonBuilder comNivel(int nivelMinimo) {
        this.nivelEsperado = nivelMinimo;
        return this;
    }

    public PokemonBuilder comNivelMenor(int nivelMenor) {   
        this.nivelEsperado = nivelMenor;
        return this;
    }

    public PokemonBuilder comNivelMaior(int nivelMaior) {
        this.nivelEsperado = nivelMaior;
        return this;
    }

    public PokemonBuilder comFelicidade(int felicidade) {
        this.felicidadeEsperada = felicidade;
        return this;
    } 
}
