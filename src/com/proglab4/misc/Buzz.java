package com.proglab4.misc;

import com.proglab4.impl.Buzzable;

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
}
