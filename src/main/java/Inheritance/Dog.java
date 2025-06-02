package Inheritance;

public class Dog extends Mammals{
    int dogID;
    int dogName;

    Dog(){
//        Animal();
//        Mammals();    before data member of Dog are initialized, constructor of Animal & Mammals are called automatically
//        super();
        super.sleep(); // Mammal's sleep function
        super.eat(); // Animal's eat function
        eat();// Dog's eat function
        sleep();
        dogID = super.mammalID;
        dogName = 10;
    }

    void bark(){
        System.out.println("Dogs bark !!");
    }

    void eat(){
        super.eat(); // calls the closest ancestor where eat() is present
        System.out.println("Dog is eating.");
    }
}
