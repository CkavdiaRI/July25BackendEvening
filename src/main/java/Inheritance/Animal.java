package Inheritance;

public class Animal {
    String name;
    private int animalID;

    Animal(){
        name = "Animal";
        animalID = 2;
    }

    void eat(){
        System.out.println("Animal is eating.");
    }
}
