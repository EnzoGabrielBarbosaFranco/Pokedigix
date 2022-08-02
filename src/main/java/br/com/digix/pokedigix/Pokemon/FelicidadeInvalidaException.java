package br.com.digix.pokedigix.Pokemon;

public class FelicidadeInvalidaException extends Exception{
        public FelicidadeInvalidaException() {
            super("A felicidade deve estar entre 0 e 100.");
        }  
}
