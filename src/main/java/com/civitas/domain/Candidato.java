package com.civitas.domain;

public class Candidato {

    private String nome;
    private String numero;
    private Partido partido;

    public Candidato(String nome, String numero, Partido partido) {
        this.nome = nome;
        this.numero = numero;
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public Partido getPartido() {
        return partido;
    }
}