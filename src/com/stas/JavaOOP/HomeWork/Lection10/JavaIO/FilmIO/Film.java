package com.stas.JavaOOP.HomeWork.Lection10.JavaIO.FilmIO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by Stas on 14.07.2017.
 * Film: название, год выпуска, список имен актеров, список жанров.
 */
public class Film {
    private String title;
    private int yearOfRelease;
    private ArrayList<Genre> genres = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<>();

    Film(String title, int yearOfRelease, Genre genre, Actor actor) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.genres.add(genre);
        this.actors.add(actor);
    }

    public void addGenre(Genre genre) {
        this.genres.add(genre);
    }

    public void addGenres(Genre... genre) {
        for (Genre element : genre) {
            this.genres.add(element);
        }
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public void addActors(Actor... actor) {
        for (Actor element : actor) {
            actors.add(element);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genres=" + genres +
                ", actors=" + actors +
                "}";
    }

    public String toOutputString() {
        StringJoiner stringJoiner = new StringJoiner(";");
        return stringJoiner.add(getTitle()).
                add(String.valueOf(getYearOfRelease())).
                add(FilmsRunner.joinerFromArray(getGenres())).
                add(FilmsRunner.joinerFromArray(getActors())).toString();
    }


}
