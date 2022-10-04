package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();

    public Integer id;
    public String title;
    public String description;
    public Integer year;
    public Integer actorId;

    static {
        new Movie(1, "Creed",
                "Creed is a 2015 American sports drama film directed by Ryan Coogler from a screenplay by Coogler, Aaron Covington and contributions by Sylvester Stallone. It is the sequel to Rocky Balboa (2006), the seventh installment and spin-off of the Rocky franchise, and stars Michael B",
                2018, 1);
        new Movie(2, "Top Gun",
                "Top Gun is a 1986 American action film directed by Tony Scott, and produced by Don Simpson and Jerry Bruckheimer, in association with Paramount Pictures. The screenplay was written by Jim Cash and Jack Epps Jr., and was inspired by an article titled Top Guns, written by Ehud Yonay and published in California magazine three years earlier. ",
                2022, 2);
        new Movie(3, "Rocky",
                "Rocky is a 1976 American drama film directed by John G. Avildsen and written by and starring Sylvester Stallone. It is the first installment in the Rocky franchise. It also stars Talia Shire, Burt Young, Carl Weathers, and Burgess Meredith. In the film, Rocky Balboa (Stallone), an uneducated, small-time club fighter and debt collector gets an unlikely shot at the world heavyweight championship held by Apollo Creed (Weathers).",
                1976, 3);
        new Movie(4, "Rambo",
                "John James Rambo (born July 6, 1946) is a fictional character in the Rambo franchise. He first appeared in the 1972 novel First Blood by David Morrell, but later became more famous as the protagonist of the film series, in which he was played by Sylvester Stallone.",
                1972, 4);
    }

    public Movie(Integer id, String title, String description, Integer year, Integer actorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);

    }

    public void displayInfo() {
        System.out.println("Title of the movie: " + this.title + ".Description:" + this.description
                + ". The movie was made in" + this.year);
    }
}