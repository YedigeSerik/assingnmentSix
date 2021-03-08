package com.fourth;

public class Main {

    public static void main(String[] args) {


        Director director=new Director(new HouseBuilder());

        director.make("simple");

        System.out.println("Building is completed successful");


    }
}
