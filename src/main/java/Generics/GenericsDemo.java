package Generics;
import Generics.model.*;
import Generics.utils.Utility;

import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        System.out.println("== Generic Class Demo ==");
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox);

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println(intBox);


        Pair<String, Integer> student = new Pair<>("John", 101);
        System.out.println("Name: " + student.getKey());
        System.out.println("Roll No: " + student.getValue());


        System.out.println("\n== Generic Method Demo ==");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Utility.printList(names);

        System.out.println("\n== Invariance ==");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        // ❌ List<Animal> animals = dogs; // Compile Error
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        System.out.println("Animals: " + animals);

        System.out.println("\n== Upper Bounded Wildcard ==");
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(2.5, 3.5);
        Utility.sumNumbers(intList);
        Utility.sumNumbers(doubleList);
//
//        System.out.println("\n== Lower Bounded Wildcard ==");
//        List<Number> numbers = new ArrayList<>();
//        Utility.addIntegers(numbers);

//        System.out.println("\n== Covariance (List<? extends Animal>) ==");
//        printAnimalList(dogs); // ✅ Works
//        printAnimalList(animals); // ✅ Works
//
//        System.out.println("\n== Contravariance (List<? super Dog>) ==");
//        List<Animal> superDogList = new ArrayList<>();
//        acceptDogOrSuper(superDogList);
//
//        System.out.println("\n== Raw Type ==");
//        rawTypeExample();
    }

//    // Wildcard with extends - read-only
//    public static void printAnimalList(List<? extends Animal> animals) {
//        for (Animal a : animals) {
//            System.out.println(a);
//        }
//        // animals.add(new Dog()); ❌ Not allowed
//    }
//
//    // Wildcard with super - write-only
//    public static void acceptDogOrSuper(List<? super Dog> list) {
//        list.add(new Dog());
//        list.add(new Dog());
//        System.out.println("Added Dogs to super-type list: " + list);
//    }
//
//    // Raw Type demo
//    public static void rawTypeExample() {
//        Box rawBox = new Box(); // raw type
//        rawBox.set("Raw Box");
//
//        Box<Integer> typedBox = rawBox; // unchecked warning
//
//        try {
//            Integer number = typedBox.get(); // Runtime error
//            System.out.println("Value: " + number);
//        } catch (ClassCastException e) {
//            System.out.println("⚠️ ClassCastException: " + e.getMessage());
//        }
//    }
}
