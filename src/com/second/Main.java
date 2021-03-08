package com.second;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Ship().createTransport().deliver());
        System.out.println(new Truck().createTransport().deliver());


    }
}
