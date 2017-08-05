package com.stas.JavaOOP.HomeWork.Lection4.FileSystem;

/**
 * Created by stanislavz on 04-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        //dir1
        Directory dir1 = new Directory("dir1");
        root.addObjectToDirectory(dir1);
        //dir1-f1
        File f1 = new File("f1",10);
        dir1.addObjectToDirectory(f1);
        //dir1-f2
        File f2 = new File("f2",20);
        dir1.addObjectToDirectory(f2);

        //dir2
        Directory dir2 = new Directory("dir2");
        root.addObjectToDirectory(dir2);
        //dir2-dir3
        Directory dir3 = new Directory("dir3");
        dir2.addObjectToDirectory(dir3);
        //dir2-dir3-f3
        File f3 = new File("f3",30);
        dir3.addObjectToDirectory(f3);
        File f4 = new File("f4",40);
        dir2.addObjectToDirectory(f4);

        //root-f5
        File f5 = new File("f5", 50);
        root.addObjectToDirectory(f5);

        System.out.println("Root size = " + root.getSize());
    }
}
