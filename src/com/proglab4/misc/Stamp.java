package com.proglab4.misc;

public class Stamp {
    private String country;
    private String image;
    private boolean isBeautiful = false;

    public Stamp() {
    }

    public Stamp(String country, String image) {
        setCountry(country);
        setImage(image);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isBeautiful() {
        return isBeautiful;
    }

    public void setBeautiful(boolean beautiful) {
        isBeautiful = beautiful;
    }

    @Override
    public String toString() {
        if (country != null && image != null)
            return "Марка{" +
                    "country='" + country + '\'' +
                    ", image='" + image + '\'' +
                    '}';
        return "Марка";
    }
}
