package com.design.patterns.factory;

/**
 * Created by Asus on 03.10.2017.
 */
public class MySqlDb extends Database {
    public Object read(int id) {
        return new Integer(12);
    }
}
