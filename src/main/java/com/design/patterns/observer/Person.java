package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Asus on 03.10.2017.
 */
public class Person implements Observer {
    public void update(Observable o, Object arg) {
        if(arg.equals(false)){
            System.out.println("I can go now");
        }
        else {
            System.out.println("Toilet is busy :(");
        }
    }
}
