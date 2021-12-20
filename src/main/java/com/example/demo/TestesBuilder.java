package com.example.demo;

import com.example.demo.builder.Cachorro;
import com.example.demo.builder.CachorroBuilder;

import java.time.LocalDate;

public class TestesBuilder {

    public static void main(String[] args) {
        Cachorro cachorro = CachorroBuilder.builder()
                .addNome("Rex")
                .addDataNascimento(LocalDate.of(2015, 10, 10))
                .addPeso(10.0)
                .addSexo("M")
                .addRaca("Pitbull")
                .get();
        cachorro.getNome();
    }

}
