package com.acc.springcore;

public class Database {
    private static Database database;

    private Database(){

    }

    public static Database getInstance(){
        return database == null ? database = new Database() : database;
    }
}
