package com.stas.JavaOOP.HomeWork.Lection10.JavaIO.FilmIO;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by stanislavz on 03-Aug-17.
 */
public class IOFilms extends Films {

    public static String readTextFileContent(String fileName) {
        StringJoiner result = new StringJoiner("\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
             result.add(parseFilmFromFile(line).toString());
                //System.out.println(parseFilmFromFile(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void writeToTextFile(String fileName, Film film) throws IOException {
        BufferedWriter output = null;
        try {
            output = new BufferedWriter(new FileWriter(fileName));
            output.write(film.toOutputString());
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static Film parseFilmFromFile(String line) {
        if (line == null || line.isEmpty()) {
            return null;
        }

        String[] tokens = line.split(";");

//        if (!Validator.isInt(tokens[0]) || !Validator.isInt(tokens[2])) {
//            return null;
//        }

        String title = tokens[0];
        int yearOfRelease = Integer.parseInt(tokens[1]);
        String[] genres = parseGenres(tokens[2]);
        String[] actors = parseActors(tokens[3]);
        Film film = new Film(title, yearOfRelease, Genre.valueOf(genres[0]), new Actor(actors[0]));

        if (genres.length > 1) {
            for (int i = 1; i < genres.length; i++) {
                film.addGenre(Genre.valueOf(genres[i]));
            }
        }

        if (actors.length > 1) {
            for (int i = 1; i < actors.length; i++) {
                film.addActor(new Actor(actors[i]));
            }
        }

        return film;
    }

    private static String[] parseGenres(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }
        String[] listOfGenres = token.split(",");
        return listOfGenres;
    }

    private static String[] parseActors(String token) {
        if (token == null || token.isEmpty()) {
            return null;
        }
        String[] listOfActors = token.split(",");
        return listOfActors;
    }


    public static void printBinFileContent (Object object) {

    }

}

