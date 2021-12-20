package com.example.demo.factory;

import java.time.LocalDate;
import java.time.Period;

public class Cachorro {

    private String nome;
    private LocalDate dataNascimento;
    private String raca;
    private String sexo;
    private Double peso;

    protected Cachorro(String nome, LocalDate dataNascimento, String raca, String sexo, Double peso){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getRaca() {
        return raca;
    }

    public String getSexo() {
        return sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
