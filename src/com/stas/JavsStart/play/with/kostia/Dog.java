package com.stas.JavsStart.play.with.kostia;

/**
 * Created by Stas on 12.03.2017.
 */
public class Dog extends Animal{
    private int i = 1;

    public void talk(){
        String word;
        if(i<=2){
            word = "gav";
        }else{
            word = "gafff";
        }
        i++;
        System.out.println(word);
    }

    public void serve(){
        System.out.println("serv");
    }

}
