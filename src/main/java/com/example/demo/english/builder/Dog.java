package com.example.demo.english.builder;

import java.time.LocalDate;
import java.time.Period;

public class Dog {
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String sex;
    private Double weight;

    protected Dog(){

    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
