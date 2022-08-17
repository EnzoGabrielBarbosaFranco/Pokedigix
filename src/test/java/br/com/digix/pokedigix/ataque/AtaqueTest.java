package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.Ataque.AcuraciaInvalidaException;
import br.com.digix.pokedigix.Ataque.Ataque;
import br.com.digix.pokedigix.Ataque.Categoria;
import br.com.digix.pokedigix.Ataque.ForcaInvalidaParaCategoriaException;
import br.com.digix.pokedigix.Ataque.TipoInvalidaParaCategoriaException;
import br.com.digix.pokedigix.tipo.Tipo;

public class AtaqueTest {
    @Test
    public void deve_poder_criar_um_ataque() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        int forcaEsperada = 100;
        double acuraciaEsperada = 100;
        int pontosDePoderEsperado = 50;
        Categoria categoriaEsperada = Categoria.ESPECIAL;
        String descricaoEsperada = "Top";
        String nomeEsperado = "Choque do Trovão";
        Tipo tipoEsperado = new Tipo ("Elétrico");

        Ataque ataque = new Ataque(forcaEsperada, acuraciaEsperada, pontosDePoderEsperado, categoriaEsperada, descricaoEsperada, nomeEsperado, tipoEsperado);

        assertEquals(forcaEsperada, ataque.getForca());
        assertEquals(acuraciaEsperada, ataque.getAcuracia());
        assertEquals(pontosDePoderEsperado, ataque.getPontosDePoder());
        assertEquals(categoriaEsperada, ataque.getCategoria());
        assertEquals(descricaoEsperada, ataque.getDescricao());
        assertEquals(nomeEsperado, ataque.getNome());

    }

    @Test
    public void deve_ser_obrigatorio_informar_um_tipo() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        Tipo tipoEsperado = new Tipo("Elétrico");
        Ataque ataque = new AtaqueBuilder().comTipo(tipoEsperado).construir();
        assertEquals(tipoEsperado, ataque.getTipo());
    }

    @Test
    public void nao_deve_ter_acuracia_menor_que_zero(){
        int acuracia = -1;

        assertThrows(AcuraciaInvalidaException.class, () -> {
            new AtaqueBuilder().comAcuracia(acuracia).construir();
        });

        assertThrows(AcuraciaInvalidaException.class, () -> {
            new AtaqueBuilder().comAcuracia(acuracia).comCategoriaEfeito().construir();
        });
    }

    @Test
    public void nao_deve_ter_acuracia_maior_que_cem(){
        int acuracia = 101;

        assertThrows(AcuraciaInvalidaException.class, () -> {
            new AtaqueBuilder().comAcuracia(acuracia).construir();
        });

        assertThrows(AcuraciaInvalidaException.class, () -> {
            new AtaqueBuilder().comAcuracia(acuracia).comCategoriaEfeito().construir();
        });
    }

    @Test
    public void deve_poder_ter_acuracia_igual_a_zero() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException{
        int acuraciaEsperada = 0;

        Ataque ataque = new AtaqueBuilder().comAcuracia(acuraciaEsperada).construir();

        assertEquals(acuraciaEsperada, ataque.getAcuracia());
    }

    @Test
    public void nao_deve_ter_forca_nem_tipo_quando_a_categoria_for_efeito() throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaException, TipoInvalidaParaCategoriaException {
        Categoria categoria = Categoria.EFEITO;
        int forca = 0;
        Tipo tipo = null;

        Ataque ataque = new AtaqueBuilder()
                            .comCategoriaEfeito()
                            .construir();

        assertEquals(categoria, ataque.getCategoria());
        assertEquals(forca, ataque.getForca());
        assertEquals(tipo, ataque.getTipo());
    }

    @Test
    public void nao_deve_ter_ataque_de_categoria_física_sem_forca() {
        Categoria categoria = Categoria.FISICO;
        int forca = 0;

        assertThrows(ForcaInvalidaParaCategoriaException.class, () -> {
            new AtaqueBuilder().comForca(forca).comCategoria(categoria).construir();
        });
    }

    @Test
    public void nao_deve_ter_ataque_de_categoria_física_sem_tipo() {
        Categoria categoria = Categoria.FISICO;
        Tipo tipo = null;

        assertThrows(TipoInvalidaParaCategoriaException.class, () -> {
            new AtaqueBuilder().comTipo(tipo).comCategoria(categoria).construir();
        });
    }

    @Test
    public void nao_deve_ter_ataque_de_categoria_especial_sem_forca_() {
        Categoria categoria = Categoria.ESPECIAL;
        int forca = 0;

        assertThrows(ForcaInvalidaParaCategoriaException.class, () -> {
            new AtaqueBuilder().comForca(forca).comCategoria(categoria).construir();
        });
    }

    @Test
    public void nao_deve_ter_ataque_de_categoria_especial_sem_tipo() {
        Categoria categoria = Categoria.ESPECIAL;
        Tipo tipo = null;

        assertThrows(TipoInvalidaParaCategoriaException.class, () -> {
            new AtaqueBuilder().comTipo(tipo).comCategoria(categoria).construir();
        });
    }
}
