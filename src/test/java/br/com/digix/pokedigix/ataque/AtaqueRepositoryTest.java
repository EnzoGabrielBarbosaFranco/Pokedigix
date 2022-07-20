package br.com.digix.pokedigix.ataque;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Ataque.Ataque;

@DataJpaTest
public class AtaqueRepositoryTest {

    @Autowired
    private AtaqueRepository ataqueRepository;

    @Test
    public void deve_salvar_um_ataque() {
        Long idEsperado = 1L;
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        String categoriaEsperada = "Eletrico";
        String descricaoEsperada = "Top";
        String nomeEsperado = "Eletrico";
        Ataque ataque = new Ataque(idEsperado, forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada,
                descricaoEsperada, nomeEsperado);

        ataqueRepository.save(ataque);

        assertEquals(idEsperado, ataque.getId());
        assertEquals(forcaEsperada, ataque.getForca());
        assertEquals(acuraciaEsperada, ataque.getAcuracia());
        assertEquals(pontosDePoderEsperado, ataque.getPontosDePoder());
        assertEquals(categoriaEsperada, ataque.getCategoria());
        assertEquals(descricaoEsperada, ataque.getDescricao());
        assertEquals(nomeEsperado, ataque.getNome());
    }
}
