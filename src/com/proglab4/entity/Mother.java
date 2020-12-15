package com.proglab4.entity;

public class Mother extends Entity {

    private Entity son;

    public Mother(Entity son) {
        this.son = son;
    }

    public Entity getSon() {
        return son;
    }

    public void setSon(Entity son) {
        this.son = son;
    }

    @Override
    public String getName() {
        return "Мама";
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
