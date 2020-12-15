package com.proglab4.place;

import com.proglab4.entity.Entity;

public class Village extends Place {
    @Override
    public String getName() {
        return "Деревня";
    }

    @Override
    public String toString() {
        return String.format("%s{owner: %s}", getName(), getOwner().getName());
    }

    public class Redneck extends Entity {

        {
            setPlace(Village.this);
        }

        @Override
        public String getName() {
            return "Деревенщина";
        }

        @Override
        public Sex getSex() {
            return null;
        }

        @Override
        public String toString() {
            return getName();
        }
    }
}
