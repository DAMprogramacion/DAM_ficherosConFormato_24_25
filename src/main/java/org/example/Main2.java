package org.example;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = Helper.getPeople("files/people.json");
        System.out.printf("read lines: %d%n", people.size());
        School school = new School("IES Nuevo", people);
        school.getPersonMap().values().stream().forEach(System.out::println);
        school.deletePerson("mlabdenq0@pbs.org");
        System.out.printf("Nº of people: %d%n",  school.getPersonMap().size());
        school.deletePerson("mlabdenq0@pbs.org");
        System.out.printf("Nº of people: %d%n",  school.getPersonMap().size());
        school.updatePerson(new Person("mlabdenq0@pbs.org", "juan", "merino"));
        System.out.println(school.getPersonByEmail("mlabdenq0@pbs.org"));
        school.updatePerson(new Person("snealand38@webs.com", "juan", "merino"));
        System.out.println(school.getPersonByEmail("snealand38@webs.com"));
        school.addPerson(new Person("mmmmm@mmmmm.es", "benito", "garcía"));
        System.out.printf("Nº of people: %d%n",  school.getPersonMap().size());
        System.out.printf("Nº of people form Spain: %d%n",
                school.getPersonByCountry("es").size());
        System.out.printf("Nº of people form UK: %d%n",
                school.getPersonByCountry("uk").size());




    }
}
