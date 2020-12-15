package com.proglab4.entity;

public class Grandmother extends Entity{
    @Override
    public String getName() {
        return "Бабушка";
    }

    @Override
    public Sex getSex() {
        return Sex.FEMALE;
    }
}
