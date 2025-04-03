package org.example.ejercicio1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<Person> getPeople(String path) {
        Gson gson = new Gson();
        List<Person> people = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
             people = new Gson().fromJson(reader, new TypeToken<List<Person>>() {}.getType());
        } catch (IOException e) {
            System.err.println(e.getMessage() + ", the file doesn't exist");
        }
        return people;
    }
}
