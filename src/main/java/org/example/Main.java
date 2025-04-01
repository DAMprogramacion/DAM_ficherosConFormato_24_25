package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Person> people = null;
        try (Reader reader = Files.newBufferedReader(Paths.get("files/people.json"))) {
            people = new Gson().fromJson(
                    reader, new TypeToken<List<Person>>() {}.getType());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        people.forEach(System.out::println);
    }
}




