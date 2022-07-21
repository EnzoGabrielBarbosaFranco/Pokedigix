package br.com.digix.pokedigix.treinador;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Treinador.Treinador;

public class TreinadorTest {

    @Test
    public void deve_poder_criar_um_treinador() {
        Long idEsperado = 1L;
        int nivelEsperado = 100;
        double dinheiroEsperado = 10000;
        String nomeEsperado = "EnzoEletropau";

        Treinador treinador = new Treinador(nivelEsperado, dinheiroEsperado, nomeEsperado);

        assertEquals(nivelEsperado, treinador.getNivel());
        assertEquals(dinheiroEsperado, treinador.getDinheiro());
        assertEquals(nomeEsperado, treinador.getNome());

    }
}

