package br.com.digix.pokedigix.Pokemon;

public class NivelMenorException extends Exception {
    public NivelMenorException() {
        super("O nível deve estar entre 1 e 100.");
    }    
}
