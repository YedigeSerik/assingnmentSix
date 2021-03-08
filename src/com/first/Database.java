package com.first;

public class  Database
{

    public String name;
    private static Database database;

    public Database(String name) {
        this.name = name;
    }

    static Database getInstance(String name){
        if(database==null)
            database=new Database(name);
        return database;
    }

}