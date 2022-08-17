package br.com.digix.pokedigix.tipo;


import org.junit.jupiter.api.Test;


public class TipoTest {
    @Test
    public void deve_poder_criar_um_tipo() {
        String nomeEsperado = "Fantasma";

        Tipo tipo = new Tipo(nomeEsperado);

        assertEqual(nomeEsperado, tipo.getNome());
    }

    private void assertEqual(String nomeEsperado, String nome) {
    }
}
