package com.stas.JavaOOP.Lection1_2;

/**
 * Created by stanislavz on 24-Jun-17.
 */
public class DogRunnder {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", "Stas");
        Dog dog2 = new Dog("F", "T");
        Dog dog3 = new Dog("I", "A");
        System.out.println(dog.dogInfo());
        dog.bark("wow",3);
        System.out.println("-------------");
        Owner owner = new Owner(dog.ownerName, dog);
        System.out.println(owner);
        owner.giveCommand();

        System.out.println("------------");
        Trainer trainer = new Trainer("John");
        trainer.addDogToList(dog);
        trainer.addDogToList(dog3);
        trainer.addDogToList(dog2);
        System.out.println(trainer.name);
        //trainer.dogsInfo();
        trainer.coachDogsInList();

        System.out.println(trainer);
    }
}
