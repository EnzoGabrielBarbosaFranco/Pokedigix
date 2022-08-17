package br.com.digix.pokedigix.Ataque;


public class AtaqueRequestDTO {

    private int forca;
    private double acuracia;
    private int pontosDePoder;
    private Categoria categoria;
    private String descricao;
    private String nome;
    private Long tipoId;
    
    
    public AtaqueRequestDTO(String nome, int forca, double acuracia, int pontosDePoder, Categoria categoria, String descricao, Long tipoId) {
        this.nome = nome;
        this.forca = forca;
        this.acuracia = acuracia;
        this.pontosDePoder = pontosDePoder;
        this.categoria = categoria;
        this.descricao = descricao;
        this.tipoId = tipoId;
    }
    
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public double getAcuracia() {
        return acuracia;
    }
    public void setAcuracia(double acuracia) {
        this.acuracia = acuracia;
    }
    public int getPontosDePoder() {
        return pontosDePoder;
    }
    public void setPontosDePoder(int pontosDePoder) {
        this.pontosDePoder = pontosDePoder;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getTipoId() {
        return tipoId;
    }

    public void setTipoId(Long tipoId) {
        this.tipoId = tipoId;
    }

}
