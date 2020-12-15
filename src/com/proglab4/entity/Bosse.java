package com.proglab4.entity;

public class Bosse extends Entity {
    @Override
    public String getName() {
        return "Боссе";
    }

    @Override
    public Sex getSex() {
        return Sex.MALE;
    }

    @Override
    public String toString() {
        return getName();
    }
}
