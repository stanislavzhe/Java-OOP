package com.stas.JavsStart.play.with.kostia;

/**
 * Created by Stas on 12.03.2017.
 */
public class Cat extends Animal{
    private int i = 1;
    private static int count = 0;

    public Cat(String name) {
        setName(name);
        count ++;
    }

    public Cat(String name, int age) {
        this(name);
        setAge(age);
    }

    public void talk(){
        String word;
        if(i==1){
            word = "myau";
        }else{
            word = "murmyau";
        }
        i++;
        System.out.println(word);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void incrementCounter(){
        count++;
    }
}
