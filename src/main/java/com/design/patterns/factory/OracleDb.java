package com.design.patterns.factory;

import java.util.Date;

/**
 * Created by Asus on 03.10.2017.
 */
public class OracleDb extends Database {
    public Object read(int id) {
        return new Date();
    }
}
