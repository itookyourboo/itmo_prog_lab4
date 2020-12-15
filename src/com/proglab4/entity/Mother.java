package com.proglab4.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mother mother = (Mother) o;
        return Objects.equals(son, mother.son);
    }

    @Override
    public int hashCode() {
        return Objects.hash(son);
    }
}
