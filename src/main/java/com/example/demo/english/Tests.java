package com.example.demo.english;

import com.example.demo.english.domain.Dog;

import java.time.LocalDate;

public class Tests {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", LocalDate.of(2015, 10, 10), "pitbull", "M", 10.0);
        dog.getName();
    }

}
