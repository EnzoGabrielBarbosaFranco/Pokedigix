package br.com.digix.pokedigix.tipo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.tipo.Tipo;
import br.com.digix.pokedigix.tipo.TipoRepository;

@DataJpaTest
public class TipoRepositoryTest {

    @Autowired
    private TipoRepository tipoRepository;

    @Test
    public void deve_salvar_um_tipo() {
        String nomeEsperado = "Fantasma";
        Long idEsperado = 1L;
        Tipo tipo = new Tipo(nomeEsperado);

        tipoRepository.save(tipo);
    }
}
