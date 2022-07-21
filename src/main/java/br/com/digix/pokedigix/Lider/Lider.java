package br.com.digix.pokedigix.Lider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 15)
    private String nome;
    private int nivel;
    @Column(nullable = false, length = 0)
    private String insignia;
    public Lider(String nome, int nivel, String insignia) {
        this.nome = nome;
        this.nivel = nivel;
        this.insignia = insignia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getInsignia() {
        return insignia;
    }
    public void setInsignia(String insignia) {
        this.insignia = insignia;
    }
    public Object getId() {
        return this.id;
    }
}
