package br.com.digix.pokedigix.Endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 15)
    private String cidade;

    @Column(nullable = false, length = 15)
    private String regiao;

    public Endereco(String cidade, String regiao) {
        this.cidade = cidade;
        this.regiao = regiao;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    public Object getId() {
        return this.id;
    }
}
