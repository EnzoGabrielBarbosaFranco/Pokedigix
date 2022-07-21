package br.com.digix.pokedigix.Evolucao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evolucao {
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int nivel;
    
    @Column(nullable = false, length = 15)
    private String pedra;

    private int felicidade;
    
    public Evolucao(int nivel, String pedra, int felicidade) {
        this.nivel = nivel;
        this.pedra = pedra;
        this.felicidade = felicidade;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getPedra() {
        return pedra;
    }
    public void setPedra(String pedra) {
        this.pedra = pedra;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public Object getId() {
        return this.id;
    }
}
