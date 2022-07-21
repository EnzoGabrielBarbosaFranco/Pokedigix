package br.com.digix.pokedigix.lider;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Lider.Lider;

public class LiderTest {

    @Test
    public void deve_poder_criar_um_lider() {
        Long idEsperado = 1L;
        String nomeEsperado = "EnzoEletropau";
        int nivelEsperado = 100;
        String insigniaEsperada = "Elétrica";

        Lider lider = new Lider(nomeEsperado, nivelEsperado, insigniaEsperada);

        assertEquals(nomeEsperado, lider.getNome());
        assertEquals(nivelEsperado, lider.getNivel());
        assertEquals(insigniaEsperada, lider.getInsignia());

    }
}
