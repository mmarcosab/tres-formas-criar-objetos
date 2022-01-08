package com.example.demo.english.builder;

import java.time.LocalDate;

public class DogBuilder {

    private Dog dog;

    public DogBuilder() {
        this.dog = new Dog();
    }

    public static DogBuilder builder() {
        return new DogBuilder();
    }

    public DogBuilder addName(String nome) {
        this.dog.setName(nome);
        return this;
    }

    public DogBuilder addBirthDate(LocalDate birthDate) {
        this.dog.setBirthDate(birthDate);
        return this;
    }

    public DogBuilder addBreed(String raca) {
        this.dog.setRaca(raca);
        return this;
    }

    public DogBuilder addWeight(Double peso) {
        this.dog.setWeight(peso);
        return this;
    }

    public DogBuilder addSex(String sexo) {
        this.dog.setSex(sexo);
        return this;
    }

    public Dog get() {
        return this.dog;
    }

}
