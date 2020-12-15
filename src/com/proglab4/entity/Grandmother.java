package com.proglab4.entity;

public class Grandmother extends Entity {

    private Entity grandson;

    public Grandmother(Entity grandson) {
        this.grandson = grandson;
    }

    public Entity getGrandson() {
        return grandson;
    }

    public void setGrandson(Entity grandson) {
        this.grandson = grandson;
    }

    @Override
    public String getName() {
        return "Бабушка";
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
