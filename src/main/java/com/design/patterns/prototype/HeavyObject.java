package com.design.patterns.prototype;

/**
 * Created by Asus on 03.10.2017.
 */
public class HeavyObject implements Cloneable {

    private static HeavyObject template = new HeavyObject();

    public static HeavyObject getOne() throws CloneNotSupportedException {
        return (HeavyObject) template.clone();
    }

    private int counter;

    private HeavyObject() {
        try {
            Thread.sleep(10000L);
            System.out.println("Object Created");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void inc(){
        counter++;
    }

    public void dec(){
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
