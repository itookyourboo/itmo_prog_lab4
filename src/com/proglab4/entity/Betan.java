package com.proglab4.entity;

public class Betan extends Entity {
    @Override
    public String getName() {
        return "Бетан";
    }

    @Override
    public Sex getSex() {
        return Sex.FEMALE;
    }

    @Override
    public String toString() {
        return getName();
    }
}
