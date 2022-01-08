package com.example.demo.portuguese;

import com.example.demo.portuguese.builder.Dog;
import com.example.demo.portuguese.builder.CachorroBuilder;

import java.time.LocalDate;

public class TestesBuilder {

    public static void main(String[] args) {
        Dog cachorro = CachorroBuilder.builder()
                .addNome("Rex")
                .addDataNascimento(LocalDate.of(2015, 10, 10))
                .addPeso(10.0)
                .addSexo("M")
                .addRaca("Pitbull")
                .get();
        cachorro.getName();
    }

}
