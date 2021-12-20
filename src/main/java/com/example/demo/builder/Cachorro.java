package com.example.demo.builder;

import java.time.LocalDate;
import java.time.Period;

public class Cachorro {
    private String nome;
    private LocalDate dataNascimento;
    private String raca;
    private String sexo;
    private Double peso;

    protected Cachorro(){

    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    protected void setRaca(String raca) {
        this.raca = raca;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
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
