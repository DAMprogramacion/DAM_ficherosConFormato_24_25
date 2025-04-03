package org.example.ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {


    private String schoolName;
    private final Map<String, Person> personMap = new HashMap<>();

    public School (String schoolName, List<Person> people) {
        this.schoolName = schoolName;
        for (Person person : people) {
            personMap.put(person.getEmail(), person);
        }
    }

    public Person addPerson(Person person) {
        return  personMap.put(person.getEmail(), person);
    }
    public Person deletePerson(String email) {
        return personMap.remove(email);
    }

    public Map<String, Person> getPersonMap() {
        return personMap;
    }
    public Person getPersonByEmail(String email) {
        return personMap.get(email);
    }
    public void updatePerson (Person person) {
        if (personMap.containsKey(person.getEmail())) {
            personMap.get(person.getEmail()).setFirstName(person.getFirstName());
            getPersonByEmail(person.getEmail()).setLastName(person.getLastName());
        }
    }
    //métodos CRUD: add one person, remove person, update person (name y surname), deletePerson
    //stream:  devuelva una lista de objetos Person, pasado el dominio de un pais
    public List<Person> getPersonByCountry(String domain) {
        //dmace50@webeden.co.uk
        String matcher = ".+@.+\\." + domain.toLowerCase();
        return personMap.values().stream().
                filter(person -> person.getEmail().toLowerCase().matches(matcher)).
                toList();
    }
}




