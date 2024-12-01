package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VarInLambdaDemo {
    public static void main(String[] args) {
        var Roland = new Person("Roland", "Deschain");
        var Susan = new Person("Susan", "Delgado");
        var Eddie = new Person("Eddie", "Dean");
        var Detta = new Person("Detta", "Walker");
        var Jake = new Person("Jake", "Chambers");

        var filteredPerson = Stream.of(Roland, Susan, Eddie, Detta, Jake)
                .filter((var person) -> person.name.contains("a")) // same as below
                .filter(person -> person.name.contains("a")) // same as above
                .collect(Collectors.toList());
        System.out.println(filteredPerson);
    }

    static class Person {
        private String name;
        private String addr;

        public Person(String a, String b) {
            this.name = a;
            this.addr = b;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
