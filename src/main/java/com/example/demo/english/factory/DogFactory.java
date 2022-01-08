package com.example.demo.english.factory;

import java.time.LocalDate;

public class DogFactory {

    public Dog create(String name, LocalDate birthDate, String breed, String sex, Double weight){
        return new Dog(name, birthDate, breed, sex, weight);
    }

}
