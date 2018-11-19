package com.design.patterns.prototype;

/**
 * Created by Asus on 03.10.2017.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        HeavyObject one = HeavyObject.getOne();
        HeavyObject one2 = HeavyObject.getOne();
        HeavyObject one3 = HeavyObject.getOne();
    }
}
