package br.com.digix.pokedigix.Pokemon;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.tipo.Tipo;

@Entity
public class Pokemon {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, length = 25)
    private String nome;

    @Column(nullable = false)
    private int nivel;

    @Column(nullable = false)
    private int felicidade;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "pokemon_tipo",
        joinColumns = @JoinColumn(name = "pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "tipo_id")
    )
    private Collection<Tipo> tipos;
    
    @Column(nullable = false)
    private double altura;

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false, length = 20)
    private String genero;

    @Column(nullable = false)
    private int numeroPokedex;

    @Column(nullable = false, length = 20)
    private String treinador;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "pokemon_ataque",
        joinColumns = @JoinColumn(name = "pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "ataque_id")
    )
    private Collection<Ataque> ataques;

    public Collection<Ataque> getAtaques() {
        return ataques;
    }


    public Pokemon(String nome, int nivel, int felicidade, double altura, double peso, String genero,
            int numeroPokedex, String treinador,Collection<Tipo> tipos, Collection<Ataque> ataques) {
        this.nome = nome;
        this.nivel = nivel;
        this.felicidade = felicidade;
        this.tipos = tipos;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.numeroPokedex = numeroPokedex;
        this.treinador = treinador;
        this.ataques = ataques;
    }

 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public Collection <Tipo> getTipos() {
        return tipos;
    }
    public void setTipo(Tipo tipo) {
        this.tipos = tipos;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getNumeroPokedex() {
        return numeroPokedex;
    }
    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }
    public String getTreinador() {
        return treinador;
    }
    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    public Long getId() {
        return this.id;
    }
}
