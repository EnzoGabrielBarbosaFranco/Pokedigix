package br.com.digix.pokedigix.Pokemon;

public class Pokemon {
    
    private String nome;
    private int nivel;
    private int felicidade;
    private String tipo;
    private Double altura;
    private Double peso;
    private String genero;
    private int numeroPokedex;
    private String treinador;

    public Pokemon(String nome, int nivel, int felicidade, String tipo, Double altura, Double peso, String genero,
            int numeroPokedex, String treinador) {
        this.nome = nome;
        this.nivel = nivel;
        this.felicidade = felicidade;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.numeroPokedex = numeroPokedex;
        this.treinador = treinador;
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
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getNumeroPokedex() {
        return numeroPokedex;
    }
    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }
    public String getTreinador() {
        return treinador;
    }
    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
}
