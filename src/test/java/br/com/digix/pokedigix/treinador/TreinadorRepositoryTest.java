package br.com.digix.pokedigix.treinador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Treinador.Treinador;

@DataJpaTest
public class TreinadorRepositoryTest {

    @Autowired
    private TreinadorRepository treinadorRepository;

    @Test
    public void deve_salvar_um_treinador() {
        Long idEsperado = 1L;
        int nivelEsperado = 100;
        double dinheiroEsperado = 10000;
        String nomeEsperado = "EnzoEletropau";

        Treinador treinador = new Treinador(nivelEsperado, dinheiroEsperado, nomeEsperado);

        treinadorRepository.save(treinador);
       
        assertEquals(nivelEsperado, treinador.getNivel());
        assertEquals(dinheiroEsperado, treinador.getDinheiro());
        assertEquals(nomeEsperado, treinador.getNome());
    }
}


