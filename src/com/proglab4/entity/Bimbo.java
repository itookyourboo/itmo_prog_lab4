package com.proglab4.entity;

public class Bimbo extends Entity {
    @Override
    public String getName() {
        return "Бимбо";
    }

    @Override
    public Entity.Sex getSex() {
        return Entity.Sex.MALE;
    }

    @Override
    public String toString() {
        return getName();
    }
}
