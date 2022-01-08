package com.example.demo.english.factory;

import java.time.LocalDate;
import java.time.Period;

public class Dog {
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String sex;
    private Double weight;

    public Dog(String name, LocalDate birthDate, String breed, String sex, Double weight){
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}