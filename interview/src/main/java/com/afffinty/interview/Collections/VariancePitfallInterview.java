package com.afffinty.interview.Collections;

import java.util.*;

public class VariancePitfallInterview {

    // =========================================================
    // ❓ INTERVIEW QUESTION:
    // What happens here at compile time vs runtime?
    // Why does Java allow this assignment?
    // What happens if we try to insert a Dog into this array?
    // =========================================================
    public static void arrayCovariancePitfall() {

        Animal[] animals = new Dog[3];   // ⚠️ array covariance

        animals[0] = new Dog();          // OK
        animals[1] = new Animal();       // ❌ Runtime error (ArrayStoreException)

        // Explanation:
        // Arrays are covariant in Java → Dog[] is subtype of Animal[]
        // But runtime type is Dog[], so only Dog allowed
    }

    // =========================================================
    // ❓ INTERVIEW QUESTION:
    // Why does this NOT compile even though Dog extends Animal?
    // What principle is being enforced here?
    // =========================================================
    public static void genericInvariancePitfall() {

        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>(); // OK

        // ❌ Why is this illegal?
        // animals = dogs;

        // Explanation:
        // Generics are INVARIANT in Java
        // List<Dog> is NOT a subtype of List<Animal>
        // Reason: type safety (would allow adding Cat into Dog list otherwise)

        dogs.add(new Dog());
        animals.add(new Animal());
    }

    // =========================================================
    // ❓ INTERVIEW QUESTION:
    // What can you safely do with this list?
    // Can you add elements? What type can you read?
    // =========================================================
    public static void wildcardCovariancePitfall() {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<? extends Animal> animals = dogs;

        // ✔ Safe read
        Animal a = animals.get(0);
        a.speak();

        // ❌ Cannot add anything (except null)
        // animals.add(new Dog());
        // animals.add(new Animal());

        // Reason:
        // actual list could be List<Dog>, List<Cat>, etc.
        // compiler prevents unsafe writes
    }

    // =========================================================
    // ❓ INTERVIEW QUESTION:
    // Why can we add Dog here but cannot safely read Dog back?
    // What is the type of get() return value?
    // =========================================================
    public static void wildcardContravariancePitfall() {

        List<Animal> animals = new ArrayList<>();

        List<? super Dog> dogs = animals;

        dogs.add(new Dog());   // ✔ OK
        dogs.add(new Dog());   // ✔ OK

        // ❌ What is returned here?
        Object obj = dogs.get(0);

        // Explanation:
        // We only know lower bound is Dog
        // Could be List<Animal> or List<Object>
        // So compiler only guarantees Object on read
    }

    // =========================================================
    // ❓ INTERVIEW QUESTION:
    // Why does this compile but behave differently from generics?
    // What happens if we assign a Cat[] here?
    // =========================================================
    public static void arrayRuntimeFailurePitfall() {

        Animal[] animals = new Dog[2]; // allowed (covariance)

        animals[0] = new Dog();        // OK

        // ⚠️ runtime crash:
        animals[1] = new Animal();     // ArrayStoreException

        // Key insight:
        // Arrays enforce type checking at runtime
        // Generics enforce type checking at compile time
    }

    // Helper class
    static class Animal {
        void speak() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("Bark");
        }
    }

    static class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Meow");
        }
    }
}
