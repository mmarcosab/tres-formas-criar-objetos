package com.example.demo;

import com.example.demo.domain.Cachorro;

import java.time.LocalDate;

public class Testes {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", LocalDate.of(2015, 10, 10), "pitbull", "M", 10.0);
        cachorro.getNome();
    }

}
