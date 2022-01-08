package com.example.demo.portuguese.builder;

import java.time.LocalDate;

public class CachorroBuilder {

    private Dog cachorro;

    public CachorroBuilder() {
        this.cachorro = new Dog();
    }

    public static CachorroBuilder builder() {
        return new CachorroBuilder();
    }

    public CachorroBuilder addNome(String nome) {
        this.cachorro.setName(nome);
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
        this.cachorro.setSex(sexo);
        return this;
    }

    public Dog get() {
        return this.cachorro;
    }

}
