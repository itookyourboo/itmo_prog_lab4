package com.proglab4.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return isRight == father.isRight &&
                Objects.equals(son, father.son);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRight, son);
    }
}
