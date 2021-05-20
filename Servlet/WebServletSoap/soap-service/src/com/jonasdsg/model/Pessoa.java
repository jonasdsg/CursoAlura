package com.jonasdsg.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {
    private String nome;
    private String tipoSanguineo;
    private String nacionalidade;
    private String cor;

    public Pessoa(String nome, String tipoSanguineo,String nacionalidade, String cor){
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.nacionalidade = nacionalidade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public String getCor() {
        return cor;
    }
}