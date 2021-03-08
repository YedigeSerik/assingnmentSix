package com.third;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Table setChair() {
        return new ModernTable();
    }
}
