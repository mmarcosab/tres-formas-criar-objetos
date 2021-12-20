package com.example.demo.builder;

import java.time.LocalDate;
import java.time.Period;

public class CachorroBuilder {

    private Cachorro cachorro;

    public CachorroBuilder() {
        this.cachorro = new Cachorro();
    }

    public static CachorroBuilder builder() {
        return new CachorroBuilder();
    }

    public CachorroBuilder addNome(String nome) {
        this.cachorro.setNome(nome);
        return this;
    }

    public CachorroBuilder addDataNascimento(LocalDate dataNascimento) {
        this.cachorro.setDataNascimento(dataNascimento);
        return this;
    }

    public CachorroBuilder addRaca(String raca) {
        this.cachorro.setRaca(raca);
        return this;
    }

    public CachorroBuilder addPeso(Double peso) {
        this.cachorro.setPeso(peso);
        return this;
    }

    public CachorroBuilder addSexo(String sexo) {
        this.cachorro.setSexo(sexo);
        return this;
    }

    public Cachorro get() {
        return this.cachorro;
    }

}
