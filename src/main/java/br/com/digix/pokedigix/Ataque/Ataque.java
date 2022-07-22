package br.com.digix.pokedigix.Ataque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.digix.pokedigix.tipo.Tipo;

@Entity
public class Ataque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private int forca;

    @Column(nullable = false)
    private double acuracia;

    private int pontosDePoder;
    @Column(nullable = false, length = 15)
    private String categoria;

    @Column(nullable = false, length = 15)
    private String descricao;

    @ManyToOne
    private Tipo tipo;

    @Column(nullable = false, length = 15)
    private String nome;

    public Ataque(int forca, double acuracia, int pontosDePoder, String categoria, String descricao, String nome, Tipo tipo) {
        this.forca = forca;
        this.acuracia = acuracia;
        this.pontosDePoder = pontosDePoder;
        this.categoria = categoria;
        this.descricao = descricao;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Ataque(String ataqueEsperado) {
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public double getAcuracia() {
        return acuracia;
    }
    public void setAcuracia(int acuracia) {
        this.acuracia = acuracia;
    }
    public int getPontosDePoder() {
        return pontosDePoder;
    }
    public void setPontosDePoder(int pontosDePoder) {
        this.pontosDePoder = pontosDePoder;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }
}
