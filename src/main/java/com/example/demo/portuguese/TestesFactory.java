package com.example.demo.portuguese;

import com.example.demo.portuguese.factory.Cachorro;
import com.example.demo.portuguese.factory.CachorroFactory;

import java.time.LocalDate;

public class TestesFactory {

    public static void main(String[] args) {

        CachorroFactory cachorroFactory = new CachorroFactory();
        Cachorro cachorro = cachorroFactory.create("Rex", LocalDate.of(2015, 10, 10), "pitbull", "M", 10.0);
    }

}
