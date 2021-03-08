package com.first;

public class Main {

    public static void main(String[] args) {

        Database.getInstance("Tested Successful");

        System.out.println(Database.getInstance("Error").name);

    }
}
