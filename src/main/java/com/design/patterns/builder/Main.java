package com.design.patterns.builder;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car build = new Car.Builder()
                .brand("Subaru")
                .model("Impreza")
                .yearProduction(2008)
                .addEquipment("Klima")
                .addEquipment("Alarm")
                .build();
    }
}
