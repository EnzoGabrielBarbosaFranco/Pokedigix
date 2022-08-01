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
}
