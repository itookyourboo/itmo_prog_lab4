package com.proglab4.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grandmother that = (Grandmother) o;
        return Objects.equals(grandson, that.grandson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grandson);
    }
}
