package br.com.digix.pokedigix.personagem;

public class LimiteDePokemonException extends Exception {
    public LimiteDePokemonException() {
        super("Um treinador poder ter apenas 6 Pokémons ao mesmo tempo.");
    }
}
