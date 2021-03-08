package com.second;

public class Truck extends Logistics{

    @Override
    Transport createTransport() {
        return new RoadLogistics();
    }

}
