
package br.com.digix.pokedigix.personagem;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.digix.pokedigix.Pokemon.Pokemon;

@Entity
public class Lider extends Personagem {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Insignia insignia;

    public Lider(String nome, Endereco endereco, Collection<Pokemon> pokemons, Insignia insignia) {
        super(nome, endereco);
        super.pokemons = pokemons;
        this.insignia = insignia;
    }
    
}
