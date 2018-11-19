package com.design.patterns.singleton;

/**
 * Created by Asus on 03.10.2017.
 */
public class Database {

    private static Database database;

    public Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    private Database() {
    }

    public void save(Object e){
    }

    public Object read(int id){
        return null;
    }
}
