package com.example.a5723167.complementar;


public class Produto {
    public Produto(String descricao, String categoria){

        this.descricao = descricao;



    }


    private String descricao;
    private String categoria;

    public Produto(String s) {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

