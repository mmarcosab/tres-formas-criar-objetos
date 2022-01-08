package com.example.demo.portuguese.factory;

import java.time.LocalDate;

public class CachorroFactory {

    public Cachorro create(String nome, LocalDate dataNascimento, String raca, String sexo, Double peso){
        return new Cachorro(nome, dataNascimento, raca, sexo, peso);
    }

}
