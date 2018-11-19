package com.design.patterns.factory;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Database mysql = Database.of("mysql");
    }
}
