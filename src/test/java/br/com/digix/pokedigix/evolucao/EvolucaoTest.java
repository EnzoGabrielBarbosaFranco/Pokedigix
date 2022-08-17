package br.com.digix.pokedigix.evolucao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Evolucao.Evolucao;

public class EvolucaoTest {

    @Test
    public void deve_poder_criar_uma_evolucao() {
        int nivelEsperado = 100;
        String pedraEsperada = "Pedra do Trovão";
        int felicidadeEsperada = 100;

        Evolucao evolucao = new Evolucao(nivelEsperado, pedraEsperada, felicidadeEsperada);

        assertEquals(nivelEsperado, evolucao.getNivel());
        assertEquals(pedraEsperada, evolucao.getPedra());
        assertEquals(felicidadeEsperada, evolucao.getFelicidade());
    }
}
