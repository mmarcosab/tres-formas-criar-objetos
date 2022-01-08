package com.example.demo.english;

import com.example.demo.english.builder.DogBuilder;
import com.example.demo.english.builder.Dog;

import java.time.LocalDate;

public class BuilderTests {

    public static void main(String[] args) {
        Dog dog = DogBuilder.builder()
                .addName("Rex")
                .addBirthDate(LocalDate.of(2015, 10, 10))
                .addWeight(10.0)
                .addSex("M")
                .addBreed("Pitbull")
                .get();

        dog.getName();
    }

}
