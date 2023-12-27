package com.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative  {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tinesh", Gender.Male));
        personList.add(new Person("Hari", Gender.Female));
        personList.add(new Person("Thiru" , Gender.Male)) ;


        //imperative
        List<Person> malePerson = new ArrayList<>() ;
        for(Person person : personList){
            if(person.gender == Gender.Male){
                malePerson.add(person) ;
            }
        }
        for(Person person : malePerson){
            System.out.println(person);
        }

        //declarative approach
        personList.stream()
                .filter(person -> Gender.Male.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    static class Person{
        private final String name ;
        private final Gender gender ;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    enum Gender {
        Female , Male
    }
}
