package com.third;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Table setChair() {
        return new VictorianTable();
    }
}
