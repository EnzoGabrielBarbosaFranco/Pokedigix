package br.com.digix.pokedigix.personagem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.Pokemon.NivelMaiorException;
import br.com.digix.pokedigix.Pokemon.NivelMenorException;

@DataJpaTest
public class TreinadorRepositoryTest {
    
    @Autowired
    private TreinadorRepository treinadorRepository;

    @Test
    public void deve_salvar_um_treinador() throws NivelMenorException, NivelMaiorException, FelicidadeInvalidaException {
        Treinador treinador = new TreinadorBuilder().construir();

        treinadorRepository.save(treinador);

        assertNotNull(treinador.getId());
    }
}
