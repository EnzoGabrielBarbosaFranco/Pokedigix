package br.com.digix.pokedigix.Ataque;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.digix.pokedigix.Pokemon.Pokemon;
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
    private Categoria categoria;

    @Column(nullable = false, length = 15)
    private String descricao;

    @ManyToOne
    private Tipo tipo;

    @ManyToMany(mappedBy = "ataques")
    private Collection<Pokemon> pokemons;

    @Column(nullable = false, length = 15)
    private String nome;

    public Ataque(int forca, double acuracia, int pontosDePoder, Categoria categoria, String descricao, String nome, Tipo tipo) throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        
        validarAcuracia(acuracia);
        validarForca(categoria, forca);
        validarTipo(categoria,tipo);
        
        this.forca = forca;
        this.acuracia = acuracia;
        this.pontosDePoder = pontosDePoder;
        this.categoria = categoria;
        this.descricao = descricao;
        this.nome = nome;
        this.tipo = tipo;
    }

    private void validarTipo(Categoria categoria, Tipo tipo) throws TipoInvalidaParaCategoriaException {
        if(!categoria.equals(Categoria.EFEITO) && tipo == null) {
            throw new TipoInvalidaParaCategoriaException(categoria);
        }
    }

    private void validarForca(Categoria categoria, int forca) throws ForcaInvalidaParaCategoriaException {
        if(!categoria.equals(Categoria.EFEITO) && forca <= 0) {
            throw new ForcaInvalidaParaCategoriaException(categoria);
        }
    }

    private void validarAcuracia(double acuracia) throws AcuraciaInvalidaException {
        if (acuracia < 0  || acuracia > 100) {
            throw new AcuraciaInvalidaException();
        }
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Ataque(String ataqueEsperado) {
    }

    public Ataque(int acuraciaEsperada, int pontosDePoderEsperado, String descricaoEsperada, String nomeEsperado) throws AcuraciaInvalidaException {
        validarAcuracia(acuraciaEsperada);
        this.acuracia = acuraciaEsperada;
        this.pontosDePoder = pontosDePoderEsperado;
        this. descricao = descricaoEsperada;
        this.nome = nomeEsperado;
        this.categoria = Categoria.EFEITO;
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
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
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
    public Collection<Pokemon> getPokemons() {
        return pokemons;
    }
}