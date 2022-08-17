package br.com.digix.pokedigix.evolucao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Evolucao.Evolucao;

@DataJpaTest
public class EvolucaoRepositoryTest {

    @Autowired
    private EvolucaoRepository evolucaoRepository;

    @Test
    public void deve_poder_criar_uma_evolucao() {
        int nivelEsperado = 100;
        String pedraEsperada = "Pedra do Trovão";
        int felicidadeEsperada = 100;

        Evolucao evolucao = new Evolucao(nivelEsperado, pedraEsperada, felicidadeEsperada);

        evolucaoRepository.save(evolucao);

        assertEquals(nivelEsperado, evolucao.getNivel());
        assertEquals(pedraEsperada, evolucao.getPedra());
        assertEquals(felicidadeEsperada, evolucao.getFelicidade());
    }
}
