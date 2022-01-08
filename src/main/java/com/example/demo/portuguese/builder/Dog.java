package com.example.demo.portuguese.builder;

import java.time.LocalDate;
import java.time.Period;

public class Dog {
    private String name;
    private LocalDate dataNascimento;
    private String breed;
    private String sex;
    private Double peso;

    protected Dog(){

    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    protected void setRaca(String raca) {
        this.breed = raca;
    }

    protected void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public String getRaca() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}
