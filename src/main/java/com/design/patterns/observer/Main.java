package com.design.patterns.observer;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {

    public static void main(String[] args) {

    Person person1 = new Person();
    Person person2 = new Person();

    Toilet toilet = new Toilet();
    toilet.addObserver(person1);
    toilet.addObserver(person2);

    toilet.enter();
    toilet.leave();
    }
}
