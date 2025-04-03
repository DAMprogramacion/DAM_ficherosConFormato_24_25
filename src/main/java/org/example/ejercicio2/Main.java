package org.example.ejercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountryGroup countryGroup = new CountryGroup("RussianGroup");
        List<City> allCities = Helper.getCitiesFromJSONFile("files/cities.json");
        List<City> russianCities = Helper.getCitiesByCountry(allCities, "Russia");
        for (City city : russianCities)
            countryGroup.addCity(city);
        System.out.printf("Work : %B%n", russianCities.size() == countryGroup.getCities().size());
        System.out.printf("Number of cities of RussianGroup: %d%n", countryGroup.getCities().size());
        countryGroup.getCities().forEach(System.out::println);
        countryGroup.deleteCity(51.3591174,112.484985);
        System.out.printf("Number of cities of RussianGroup: %d%n", countryGroup.getCities().size());
        countryGroup.addCity(new City(-2, 10, "russia", "jaen" ));
        System.out.printf("Number of cities of RussianGroup: %d%n", countryGroup.getCities().size());
        countryGroup.updateCity(new City(-2, 10, "russia", "jaenRusa"));
        System.out.printf("Ciudad: %s", countryGroup.getCityByLatitudeAndLongitud(-2, 10));
        countryGroup.getNorthenCities().forEach(System.out::println);
        System.out.println("===================");
        countryGroup.getSouthenCities().forEach(System.out::println);

    }
}
