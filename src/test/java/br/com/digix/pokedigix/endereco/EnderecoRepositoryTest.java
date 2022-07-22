package br.com.digix.pokedigix.endereco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Endereco.Endereco;

@DataJpaTest
public class EnderecoRepositoryTest {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Test
    public void deve_poder_criar_um_endereco() {
        String cidadeEsperada = "New York";
        String regiaoEsperada = "EUA";

        Endereco endereco = new Endereco(cidadeEsperada, regiaoEsperada);

        enderecoRepository.save(endereco);

        assertEquals(cidadeEsperada, endereco.getCidade());
        assertEquals(regiaoEsperada, endereco.getRegiao());
    }
}