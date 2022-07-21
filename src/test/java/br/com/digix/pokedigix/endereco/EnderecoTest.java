package br.com.digix.pokedigix.endereco;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Endereco.Endereco;

public class EnderecoTest {

    @Test
    public void deve_poder_criar_um_endereco() {
        Long idEsperado = 1L;
        String cidadeEsperada = "New York";
        String regiaoEsperada = "EUA";

        Endereco endereco = new Endereco(cidadeEsperada, regiaoEsperada);

        assertEquals(cidadeEsperada, endereco.getCidade());
        assertEquals(regiaoEsperada, endereco.getRegiao());
    }
}
