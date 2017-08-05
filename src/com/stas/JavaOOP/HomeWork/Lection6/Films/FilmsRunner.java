package com.stas.JavaOOP.HomeWork.Lection6.Films;

/**
 * Created by Stas on 14.07.2017.
 * Enum: Создать классы:
 1. Film: название, год выпуска, список имен актеров, список жанров.
 2. Films: ArrayList<Film> films. Позволяет выполнить поиск:
 a) список фильмов с заданными жанрами (например, HORROR и THRILLER).
 b) список фильмов, выпущенных в заданные года (например, в диапазоне 1990-2000 rr.)
 c) список фильмов, в которых снимаются заданные актеры.
 3. Клиентский класс FilmsRunner, демонстрирующий работу предыдущих классов.
 */
public class FilmsRunner {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Bob");
        Actor actor2 = new Actor("Mark");
        Actor actor3 = new Actor("Nick");

        Film film1 = new Film("Black and white",2000,Genre.Action,actor1);
        Film film2 = new Film("Black",1993,Genre.Thriller,actor2);
        Film film3 = new Film("Black 2",1993,Genre.Thriller,actor3);
        film3.addGenre(Genre.Horror);
        film3.addActor(actor1);

        Films films = new Films();
        films.addFilms(film1,film2,film3);

        System.out.println(films.selectByGenres(Genre.Horror,Genre.Thriller));

        System.out.println(films.selectByYears(1990,2001));

        System.out.println(films.selectByActors(actor1,actor2));

    }
}
