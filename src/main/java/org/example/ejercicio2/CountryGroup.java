package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountryGroup {
    private String nameGroup;
    private final List<City> cities = new ArrayList<>();

    public CountryGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public List<City> getCities() {
        return cities;
    }
    public City addCity(City city) {
        if (cities.add(city))
            return city;
        return null;
    }
    public boolean deleteCity(double latitude, double longitud) {
        for (City city : cities) {
            if (city.getLongitud() == longitud && city.getLatitude() == latitude)
                return cities.remove(city);
        }
        return false;
    }
    public City getCityByLatitudeAndLongitud(double latitude, double longitud) {
        for (City city : cities)
            if (city.getLongitud() == longitud && city.getLatitude() == latitude)
                return city;
        return null;
    }
    public void updateCity(City newCity) {
        for (City city : cities)
            /*if (city.getLongitud() == newCity.getLongitud() &&
                    city.getLatitude() == newCity.getLatitude())*/
        if (city.equals(newCity)) {  //longitud y latitud iguales (equals de City)
            city.setNameCity(newCity.getNameCity());
            city.setCountry(newCity.getCountry());
        }
    }

    public List<City> getNorthenCities() {
        return cities.stream().
                filter(city -> city.getLatitude() > 0).
                toList();
    }
    public List<City> getSouthenCities() {
        return cities.stream().
                filter(city -> city.getLatitude() < 0).
                toList();
    }

}






