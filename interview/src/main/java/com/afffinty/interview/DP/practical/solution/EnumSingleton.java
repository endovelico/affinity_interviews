package com.afffinty.interview.DP.practical.solution;

public enum EnumSingleton {
    INSTANCE;

    public void doWork() {
        System.out.println("Singleton is working.");
    }

    public String getMessage() {
        return "Hello from the singleton!";
    }
}