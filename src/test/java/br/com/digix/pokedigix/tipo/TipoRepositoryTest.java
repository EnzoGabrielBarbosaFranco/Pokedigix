package br.com.digix.pokedigix.tipo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

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
    
    @Test
    public void deve_buscar_um_tipo_pelo_nome() {
        String nome = "Elétrico";
        Tipo tipo = new Tipo(nome);
        tipoRepository.save(tipo);

        Collection<Tipo> tiposRetornados = tipoRepository.findByNome(nome);

        assertTrue(tiposRetornados.contains(tipo));
    }
}
