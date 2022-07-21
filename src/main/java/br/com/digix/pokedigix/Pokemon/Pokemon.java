package br.com.digix.pokedigix.Pokemon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, length = 25)
    private String nome;

    private int nivel;
    private int felicidade;

    @Column(nullable = false, length = 20)
    private String tipo;
    
    private double altura;
    private double peso;

    @Column(nullable = false, length = 20)
    private String genero;

    private int numeroPokedex;

    @Column(nullable = false, length = 20)
    private String treinador;

    public Pokemon(String nome, int nivel, int felicidade, String tipo, double altura, double peso, String genero,
            int numeroPokedex, String treinador) {
        this.nome = nome;
        this.nivel = nivel;
        this.felicidade = felicidade;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.numeroPokedex = numeroPokedex;
        this.treinador = treinador;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public Object getId() {
        return this.id;
    }
}
