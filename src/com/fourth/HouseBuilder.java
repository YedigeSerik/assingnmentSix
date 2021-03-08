package com.fourth;

public class HouseBuilder implements Builder {

    private House house;

    @Override
    public void reset() {
        house=new House();

    }

    @Override
    public void buildFloor() {

    }

    @Override
    public void setScreens() {
        System.out.println("Roof of ur house is ... ... ... set");
    }

    @Override
    public String buildWalls() {
        return "Setting walls of your house is completed";

    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

}
