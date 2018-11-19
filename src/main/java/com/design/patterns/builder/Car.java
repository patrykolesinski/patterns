package com.design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 03.10.2017.
 */
public class Car {
    private String brand;
    private String model;
    private int yearProduction;
    private List<String> additionalEquipment;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.yearProduction = builder.yearProduction;
        this.additionalEquipment = builder.equipment;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public List<String> getAdditionalEquipment() {
        return additionalEquipment;
    }

    public static class Builder {
        private String brand;
        private String model;
        private int yearProduction;
        private List<String> equipment = new ArrayList<String>();

        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder yearProduction(int yearProduction){
            this.yearProduction = yearProduction;
            return this;
        }

        public Builder addEquipment(String equipment){
            this.equipment.add(equipment);
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
