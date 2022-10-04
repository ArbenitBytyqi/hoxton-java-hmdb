package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String firstName;
    public String lastName;
    public Integer yearOfBirth;

    static {
        new Actor(1, "Jack", "Nicholson", 1937);
        new Actor(2, "Robert", "De Niro", 1943);
        new Actor(3, "Brad", "Pitt", 1963);
        new Actor(4, "Michael", "B. Jordan", 1987);
    }

    public Actor(Integer id, String firstName, String lastName, Integer yearOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

        Actor.actors.add(this);
    }

    public void displayInfo() {
        System.out.println(
                "Name of the actor: " + this.firstName + this.lastName + ". who is born in" + this.yearOfBirth);
    }
}
