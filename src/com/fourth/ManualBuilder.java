package com.fourth;

public class ManualBuilder implements Builder{


    private Manual manual;

    @Override
    public void reset() {
        manual=new Manual();
    }

    @Override
    public String buildWalls() {
        return "Building Walls";
    }

    @Override
    public void setScreens() {

    }

    @Override
    public void buildFloor() {

    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public Manual getManual() {
        return manual;
    }

}