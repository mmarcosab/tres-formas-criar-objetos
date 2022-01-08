package com.example.demo.english;

import com.example.demo.english.factory.Dog;
import com.example.demo.english.factory.DogFactory;

import java.time.LocalDate;

public class FactoryTests {

    public static void main(String[] args) {

        DogFactory dogFactory = new DogFactory();
        Dog dog = dogFactory.create("Rex", LocalDate.of(2015, 10, 10), "pitbull", "M", 10.0);
    }

}
