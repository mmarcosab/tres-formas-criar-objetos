package com.example.demo;

import com.example.demo.factory.Cachorro;
import com.example.demo.factory.CachorroFactory;

import java.time.LocalDate;

public class TestesFactory {

    public static void main(String[] args) {

        CachorroFactory cachorroFactory = new CachorroFactory();
        Cachorro cachorro = cachorroFactory.create("Rex", LocalDate.of(2015, 10, 10), "pitbull", "M", 10.0);
    }

}
