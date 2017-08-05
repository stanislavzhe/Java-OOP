package com.stas.TasksForTraining;

import java.util.ArrayList;

/**
 * Created by stanislavz on 26-Jun-17.
 */
public class ArrayTestList {
    public static void main(String[] args) {
        ArrayList <Song> songs = new ArrayList <> ();

//        Song song = new Song("Hello");
        songs.add(new Song("Hello"));
        songs.add(new Song("New"));
        songs.add(new Song("Song"));
        for (Song song : songs) {
            System.out.println(song.name);
        }
    }


}

