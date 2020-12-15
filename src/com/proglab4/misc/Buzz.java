package com.proglab4.misc;

import com.proglab4.impl.Buzzable;

import java.util.Objects;

public class Buzz {
    private float volume;
    private float wavelength;
    private Buzzable source;

    public Buzz() {
    }

    public Buzz(float volume, float wavelength) {
        this.volume = volume;
        this.wavelength = wavelength;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getWavelength() {
        return wavelength;
    }

    public void setWavelength(float wavelength) {
        this.wavelength = wavelength;
    }

    public boolean isSimilar(Buzz buzz) {
        return Math.abs(getVolume() - buzz.getVolume()) < .1f
                && Math.abs(getWavelength() - buzz.getWavelength()) < 1f;
    }

    public Buzzable getSource() {
        return source;
    }

    public void setSource(Buzzable source) {
        this.source = source;
    }

    @Override
    public String toString() {
        if (source != null)
            return "Жужжание{source: " + source.toString() + "}";
        return "Жужжание";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buzz buzz = (Buzz) o;
        return Float.compare(buzz.volume, volume) == 0 &&
                Float.compare(buzz.wavelength, wavelength) == 0 &&
                Objects.equals(source, buzz.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, wavelength, source);
    }
}
