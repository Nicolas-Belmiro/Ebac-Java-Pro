package com.Animal_MS.dto;


public class ResgatadorDTO {


    private String nome;

    private Long quantidadeAnimais;

    public ResgatadorDTO(String nome, Long quantidadeAnimais){
        this.nome = nome;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public void setQuantidadeAnimais(Long quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }
}