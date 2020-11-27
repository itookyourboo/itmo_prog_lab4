package com.proglab3.entity;

import com.proglab3.impl.InstanceChecker;
import java.util.Objects;

public class Carlson extends Entity implements InstanceChecker {

    private boolean isHere = true;

    @Override
    public boolean canFly() {
        return true;
    }

    public void flyAway() {
        isHere = false;
    }

    public void comeBack() {
        isHere = true;
    }

    @Override
    public boolean exists() {
        return isHere;
    }

    @Override
    public void printInstance() {
        if (exists())
            System.out.println("Карлсон есть!");
        else
            System.out.println("Карлсона не было и не было...");
    }

    @Override
    public String getName() {
        return "Карлсон";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carlson carlson = (Carlson) o;
        return isHere == carlson.isHere;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHere);
    }
}