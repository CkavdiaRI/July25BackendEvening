package Inheritance;

public class Mammals extends Animal{
    int mammalID ;

    Mammals(){
        mammalID = 11;
    }

    void sleep(){
        System.out.println("Mammals sleep !!");
    }

//    void eat(){
//        System.out.println("Mammal is eating.");
//    }
}
