package com.design.patterns.factory;

/**
 * Created by Asus on 03.10.2017.
 */
public abstract class Database {
    public static Database of(String connector){
        return connector.equals("mysql") ? new MySqlDb() : new OracleDb();
    }

    public void save(Object e){

    }

    public abstract Object read(int id);
}
