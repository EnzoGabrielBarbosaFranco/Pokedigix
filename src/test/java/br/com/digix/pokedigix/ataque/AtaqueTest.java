package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Ataque.Ataque;

public class AtaqueTest {
    @Test
    public void deve_poder_criar_um_ataque() {
        Long idEsperado = 1L;
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        String categoriaEsperada = "Eletrico";
        String descricaoEsperada = "Top";
        String nomeEsperado = "Choque do Trovão";

        Ataque ataque = new Ataque(idEsperado, forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada, descricaoEsperada, nomeEsperado);

        assertEquals(forcaEsperada, ataque.getForca());
        assertEquals(acuraciaEsperada, ataque.getAcuracia());
        assertEquals(pontosDePoderEsperado, ataque.getPontosDePoder());
        assertEquals(categoriaEsperada, ataque.getCategoria());
        assertEquals(descricaoEsperada, ataque.getDescricao());
        assertEquals(nomeEsperado, ataque.getNome());

    }
}
