package com.afffinty.interview.DYNAMIC_DISPATCH;

class Parent {
    static String NAME = "Parent";
}

class Child extends Parent {
    static String NAME = "Child";
}

public class StaticFieldHidingDemo {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        System.out.println(childAsParent.NAME);   // Parent

    }
}