package com.proglab4.misc;

import com.proglab4.exceptions.StampIsBeautifulException;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return index == album.index &&
                Arrays.equals(stamps, album.stamps);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index);
        result = 31 * result + Arrays.hashCode(stamps);
        return result;
    }
}
