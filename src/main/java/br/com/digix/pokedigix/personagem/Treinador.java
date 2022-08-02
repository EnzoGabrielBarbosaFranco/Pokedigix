package br.com.digix.pokedigix.personagem;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.digix.pokedigix.Pokemon.Pokemon;

@Entity
public class Treinador extends Personagem {

    private static final int LIMITE_POKEMON = 6;

    private double dinheiro;

    private int nivel;

    @ElementCollection(targetClass = Insignia.class)
    @Column(name = "insignia")
    @Enumerated(EnumType.STRING)
    private Collection<Insignia> insignias;

    public Treinador(Endereco endereco, String nome, Pokemon primeiroPokemon) {
        super(nome, endereco);
        this.dinheiro = 3000;
        this.nivel = 1;
        this.insignias = new ArrayList<>();
        this.pokemons.add(primeiroPokemon);
    }

    public void receber(Insignia insignia) {
        this.insignias.add(insignia);
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public int getNivel() {
        return nivel;
    }

    public Collection<Insignia> getInsignias() {
        return insignias;
    }

    public void capturar(Pokemon pokemonACapturar) throws LimiteDePokemonException {
        validarQuantidadeDePokemons();
        this.pokemons.add(pokemonACapturar);
    }

    private void validarQuantidadeDePokemons() throws LimiteDePokemonException {
        if(getPokemons().size() == LIMITE_POKEMON) {
            throw new LimiteDePokemonException(); 
        }
    }
}
