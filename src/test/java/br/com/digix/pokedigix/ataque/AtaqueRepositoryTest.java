package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.Ataque.AcuraciaInvalidaException;
import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.Ataque.AtaqueRepository;
import br.com.digix.pokedigix.Ataque.Categoria;
import br.com.digix.pokedigix.Ataque.ForcaInvalidaParaCategoriaException;
import br.com.digix.pokedigix.Ataque.TipoInvalidaParaCategoriaException;
import br.com.digix.pokedigix.tipo.Tipo;
import br.com.digix.pokedigix.tipo.TipoRepository;

@DataJpaTest
public class AtaqueRepositoryTest {

    @Autowired
    private AtaqueRepository ataqueRepository;

    @Autowired
    private TipoRepository tipoRepository;

    @Test
    public void deve_salvar_um_ataque() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        Categoria categoriaEsperada = Categoria.ESPECIAL;
        String descricaoEsperada = "Top";
        String nomeEsperado = "Eletrico";
        Tipo tipoEsperado = new Tipo("Elétrico");
        Ataque ataque = new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada,
                descricaoEsperada, nomeEsperado, tipoEsperado);

        ataqueRepository.save(ataque);

        assertEquals(forcaEsperada, ataque.getForca());
        assertEquals(acuraciaEsperada, ataque.getAcuracia());
        assertEquals(pontosDePoderEsperado, ataque.getPontosDePoder());
        assertEquals(categoriaEsperada, ataque.getCategoria());
        assertEquals(descricaoEsperada, ataque.getDescricao());
        assertEquals(nomeEsperado, ataque.getNome());
        assertEquals(tipoEsperado, ataque.getTipo());
    }

    @Test
    public void deve_salvar_um_tipo_para_um_ataque() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        Categoria categoriaEsperada = Categoria.ESPECIAL;
        String descricaoEsperada = "Top";
        String nomeEsperado = "Eletrico";
        Tipo tipoEsperado = new Tipo("Elétrico");
        Ataque ataque = new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada,
                descricaoEsperada, nomeEsperado, tipoEsperado);
                
        tipoRepository.save(tipoEsperado);
        ataqueRepository.save(ataque);

        Ataque ataqueRetornado = ataqueRepository.findById(ataque.getId()).get();

        assertEquals(tipoEsperado.getNome(), ataqueRetornado.getTipo().getNome());
        assertNotNull(ataqueRetornado.getTipo().getId());
    }

    @Test
    public void deve_salvar_um_ataque_pelo_seu_tipo() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        Categoria categoriaEsperada = Categoria.ESPECIAL;
        String descricaoEsperada = "Top";
        String nomeEsperado = "Eletrico";
        Tipo tipoEsperado = new Tipo("Elétrico");
        Ataque ataque = new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada,
                descricaoEsperada, nomeEsperado, tipoEsperado);
                
        tipoRepository.save(tipoEsperado);
        ataqueRepository.save(ataque);

        Collection<Ataque> ataqueRetornado = ataqueRepository.findByTipo(tipoEsperado);

        assertTrue(ataqueRetornado.contains(ataque));
    }
}
