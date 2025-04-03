package org.example.ejercicio2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.ejercicio1.Person;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<City> getCitiesFromJSONFile(String path) {
        List<City> cities = new ArrayList<>();
        Gson gson = new Gson();
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            cities = gson.fromJson(
                    reader, new TypeToken<List<City>>() {}.getType());
        } catch (IOException e) {
            System.err.printf("Error en lectura del fichero: %s%n", e.getMessage());
        }
        return cities;
    }
    public static List<City> getCitiesByCountry(List<City> cities , String country) {
        return cities.stream().
                filter(city -> city.getCountry().toLowerCase().equals(country.toLowerCase())).
                toList();
    }
}
