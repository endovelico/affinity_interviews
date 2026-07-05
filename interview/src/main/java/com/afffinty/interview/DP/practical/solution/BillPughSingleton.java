package com.afffinty.interview.DP.practical.solution;

public final class BillPughSingleton {

    // Private constructor prevents instantiation
    private BillPughSingleton() {
    }

    // Inner static class is not loaded until referenced
    private static class SingletonHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Returns the singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doWork() {
        System.out.println("Singleton is working.");
    }
}