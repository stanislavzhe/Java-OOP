package com.stas.JavaOOP.HomeWork.Lection10.JavaIO.FilmIO;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Stas on 14.07.2017.
 * Films: ArrayList<Film> films. Позволяет выполнить поиск:
 * a) список фильмов с заданными жанрами (например, HORROR и THRILLER).
 * b) список фильмов, выпущенных в заданные года (например, в диапазоне 1990-2000 rr.)
 * c) список фильмов, в которых снимаются заданные актеры.
 */
public class Films {
    private ArrayList<Film> films = new ArrayList<>();

    Films(Film... film) {
        for (Film element : film) {
            this.films.add(element);
        }
    }

    Films(Film film) {
        this.films.add(film);
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }

    public void addFilms(Film... film) {
        for (Film element : film) {
            this.films.add(element);
        }
    }

    public ArrayList<Film> selectByGenre(Genre genre) {
        ArrayList<Film> filmsByGenre = new ArrayList<>();
        for (Film element : films) {
            if (element.getGenres().contains(genre)) {
                filmsByGenre.add(element);
            }
        }
        return filmsByGenre;
    }

    public ArrayList<Film> selectByGenres(Genre... genre) {
        ArrayList<Film> filmsByGenres = new ArrayList<>();
        for (Genre element : genre) {
            for (Film film: selectByGenre(element)) {
                if (!filmsByGenres.contains(film)) {
                    filmsByGenres.add(film);
                }
            }
        }
        return filmsByGenres;
    }

    public ArrayList<Film> selectByYear(int year){
        ArrayList<Film> filmsByYear = new ArrayList<>();
        for (Film element : films) {
            if (Objects.equals(element.getYearOfRelease(), year)) {
                filmsByYear.add(element);
            }
        }
        return filmsByYear;
    }

    public ArrayList<Film> selectByYears(int yearFrom, int yearTo) {
        ArrayList<Film> filmsByYears = new ArrayList<>();
        for (int i = yearFrom; i <= yearTo; i++) {
            for (Film film: selectByYear(i)) {
                if (!filmsByYears.contains(film)) {
                    filmsByYears.add(film);
                }
            }
        }
        return filmsByYears;
    }

    public ArrayList<Film> selectByActor(Actor actor) {
        ArrayList<Film> filmsByActor = new ArrayList<>();
        for (Film element : films) {
            if (element.getActors().contains(actor)) {
                filmsByActor.add(element);
            }
        }
        return filmsByActor;
    }

    public ArrayList<Film> selectByActors(Actor... actor) {
        ArrayList<Film> filmsByActors = new ArrayList<>();
        for (Actor element : actor) {
            for (Film film: selectByActor(element)) {
                if (!filmsByActors.contains(film)) {
                    filmsByActors.add(film);
                }
            }
        }
        return filmsByActors;
    }

    @Override
    public String toString() {
        return "Films{" +
                "films=" + films +
                "}";
    }
}
