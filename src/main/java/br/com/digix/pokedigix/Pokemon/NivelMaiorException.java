package br.com.digix.pokedigix.Pokemon;

public class NivelMaiorException extends Exception{
    public NivelMaiorException() {
        super("O nível deve estar entre 1 e 100.");
    }  
}
