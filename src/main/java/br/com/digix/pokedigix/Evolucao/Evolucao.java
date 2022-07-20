package br.com.digix.pokedigix.Evolucao;

public class Evolucao {
    private int nivel;
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
}
