package br.com.digix.pokedigix.Treinador;

public class Treinador {
    private String nome;
    private Double dinheiro;
    private int nivel;

    public Treinador(String nome, Double dinheiro, int nivel) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
