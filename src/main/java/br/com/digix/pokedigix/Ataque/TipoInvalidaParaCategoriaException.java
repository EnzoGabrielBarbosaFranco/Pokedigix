package br.com.digix.pokedigix.Ataque;

public class TipoInvalidaParaCategoriaException extends Exception{
    public TipoInvalidaParaCategoriaException(Categoria categoria) {
        super("A categoria " + categoria.name() + " deve ter tipo.");
    }
}
