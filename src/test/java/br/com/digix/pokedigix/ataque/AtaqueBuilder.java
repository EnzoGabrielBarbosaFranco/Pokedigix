package br.com.digix.pokedigix.ataque;

import br.com.digix.pokedigix.Ataque.AcuraciaInvalidaException;
import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.Ataque.Categoria;
import br.com.digix.pokedigix.Ataque.ForcaInvalidaParaCategoriaException;
import br.com.digix.pokedigix.Ataque.TipoInvalidaParaCategoriaException;
import br.com.digix.pokedigix.tipo.Tipo;

public class AtaqueBuilder {

    private int forcaEsperada;
    private int acuraciaEsperada;
    private int pontosDePoderEsperado;
    private Categoria categoriaEsperada;
    private String descricaoEsperada;
    private String nomeEsperado;
    private Tipo tipoEsperado;

    public AtaqueBuilder() {
        this.forcaEsperada = 100;
        this.acuraciaEsperada = 100;
        this.pontosDePoderEsperado = 50;
        this.categoriaEsperada = Categoria.ESPECIAL;
        this.descricaoEsperada = "Top";
        this.nomeEsperado = "Choque do Trovão";
        this.tipoEsperado = new Tipo ("Elétrico");
    }

    public Ataque construir() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        if(this.categoriaEsperada.equals(Categoria.EFEITO)){
            return new Ataque(acuraciaEsperada, pontosDePoderEsperado, descricaoEsperada, nomeEsperado);
        } else {
            return new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada, descricaoEsperada, nomeEsperado, tipoEsperado);
        }
    }

    public AtaqueBuilder comTipo(Tipo tipoEsperado) {
        this.tipoEsperado = tipoEsperado;
        return this;
    }

    public AtaqueBuilder comAcuracia(int acuracia) {
        this.acuraciaEsperada = acuracia;
        return this;
    }

    public AtaqueBuilder comCategoriaEfeito() {
        this.categoriaEsperada = Categoria.EFEITO;
        return this;
    }

    public AtaqueBuilder comForca(int forca) {
        this.forcaEsperada = forca;
        return this;
    }

    public AtaqueBuilder comCategoria(Categoria categoria) {
        this.categoriaEsperada = categoria;
        return this;
    }
    
}
