package br.com.digix.pokedigix.ataque;

import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.tipo.Tipo;

public class AtaqueBuilder {

    private int forcaEsperada;
    private int acuraciaEsperada;
    private int pontosDePoderEsperado;
    private String categoriaEsperada;
    private String descricaoEsperada;
    private String nomeEsperado;
    private Tipo tipoEsperado;

    public AtaqueBuilder() {
        this.forcaEsperada = 100;
        this.acuraciaEsperada = 100;
        this.pontosDePoderEsperado = 50;
        this.categoriaEsperada = "Eletrico";
        this.descricaoEsperada = "Top";
        this.nomeEsperado = "Choque do Trovão";
        this.tipoEsperado = new Tipo ("Elétrico");
    }

    public Ataque construir() {
        return new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada, descricaoEsperada, nomeEsperado, tipoEsperado);
    }

    public AtaqueBuilder comTipo(Tipo tipoEsperado2) {
        tipoEsperado = tipoEsperado2;
        return this;
    }
    
}
