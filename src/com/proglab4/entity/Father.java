package com.proglab4.entity;

public class Father extends Entity {

    private boolean isRight = true;

    private Entity son;

    public Father(Entity son) {
        this.son = son;
    }

    public Entity getSon() {
        return son;
    }

    public void setSon(Entity son) {
        this.son = son;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    @Override
    public String getName() {
        return "Папа";
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
