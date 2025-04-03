package org.example.ejercicio2;

import java.util.Objects;

public class City {
    //[{"nameCity":"Kujang","country":"Indonesia","latitude":-6.3967343,"longitud":107.434768},
    private String nameCity;
    private String country;
    private final double latitude;
    private final double longitud;

    public City(double latitude, double longitud, String country, String nameCity) {
        this.latitude = latitude;
        this.longitud = longitud;
        this.country = country;
        this.nameCity = nameCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.4f;%.4f", nameCity, country, latitude, longitud);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(latitude, city.latitude) == 0 &&
                Double.compare(longitud, city.longitud) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitud);
    }
}






