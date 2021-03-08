package com.third;

public class Main {

    public static void main(String[] args) {

        System.out.println(new ModernFurnitureFactory().setChair().checkType());

        System.out.println(new VictorianFurnitureFactory().setChair().checkType());



    }
}
