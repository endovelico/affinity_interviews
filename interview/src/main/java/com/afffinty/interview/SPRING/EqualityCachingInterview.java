package com.afffinty.interview.SPRING;

import java.util.*;

public class EqualityCachingInterview {

    public static void main(String[] args) {

        stringInterningCase();
        integerCachingCase();
        customObjectEqualityCase();
        mapKeyEqualityCase();
        referenceVsValueCase();
    }

    // =========================================================
    // ❓ QUESTION:
    // What will print and WHY?
    // Explain String interning behavior.
    // =========================================================
    public static void stringInterningCase() {

        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println("String == comparisons:");
        System.out.println(a == b); // ?
        System.out.println(a == c); // ?
        System.out.println(a.equals(c)); // ?

        // Expected discussion:
        // a and b point to String pool (same reference)
        // c is a new object in heap
    }

    // =========================================================
    // ❓ QUESTION:
    // Why does this sometimes print true and sometimes false?
    // Explain Integer caching (-128 to 127).
    // =========================================================
    public static void integerCachingCase() {

        Integer x = 100;
        Integer y = 100;

        Integer m = 200;
        Integer n = 200;

        System.out.println("\nInteger caching:");

        System.out.println(x == y); // ?
        System.out.println(m == n); // ?

        // Expected discussion:
        // Integer cache range: -128 to 127
        // 100 uses cached objects → same reference
        // 200 creates new objects → different references
    }

    // =========================================================
    // ❓ QUESTION:
    // What is printed and why?
    // What is missing in this class design?
    // =========================================================
    public static void customObjectEqualityCase() {

        class User {
            String name;

            User(String name) {
                this.name = name;
            }
        }

        User u1 = new User("Alice");
        User u2 = new User("Alice");

        System.out.println("\nCustom object equality:");
        System.out.println(u1 == u2);       // ?
        System.out.println(u1.equals(u2));  // ?

        // Expected discussion:
        // equals not overridden → fallback to reference equality
        // logical equality missing
    }

    // =========================================================
    // ❓ QUESTION:
    // Why does HashMap behave like this?
    // What methods are involved?
    // =========================================================
    public static void mapKeyEqualityCase() {

        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
        }

        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Bob");
        Person p2 = new Person("Bob");

        map.put(p1, "Engineer");

        System.out.println("\nHashMap key equality:");
        System.out.println(map.get(p2)); // ?

        // Expected discussion:
        // hashCode + equals used for lookup
        // p1 and p2 are different objects → lookup fails
    }

    // =========================================================
    // ❓ QUESTION:
    // What is the output and what design issue does this show?
    // =========================================================
    public static void referenceVsValueCase() {

        String s1 = "java";
        String s2 = new String("java").intern();

        System.out.println("\nReference vs Value:");

        System.out.println(s1 == s2);       // ?
        System.out.println(s1.equals(s2));  // ?

        // Expected discussion:
        // intern() forces reference to string pool
        // == becomes true
        // equals always true for same content
    }
}
