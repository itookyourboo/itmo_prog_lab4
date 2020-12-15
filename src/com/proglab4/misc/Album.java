package com.proglab4.misc;

import com.proglab4.exceptions.StampIsBeautifulException;

public class Album {

    private Stamp[] stamps;
    private int index = 0;

    public Album(int maxStamps) {
        stamps = new Stamp[maxStamps];
    }

    public void glue(Stamp stamp) throws StampIsBeautifulException {
        if (stamp.isBeautiful())
            throw new StampIsBeautifulException("Марка" + stamp.toString() + " слишком красивая");
        stamps[index++] = stamp;
    }

    public int countStamps() {
        return index;
    }
}
