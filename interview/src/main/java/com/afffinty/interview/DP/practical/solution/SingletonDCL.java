package com.afffinty.interview.DP.practical.solution;

public final class SingletonDCL {

    // Volatile ensures visibility across threads
    private static volatile SingletonDCL instance;

    // Prevent external instantiation
    private SinglSingletonDCLeton() {
    }

    // Lazy-loaded, thread-safe singleton
    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    public void doWork() {
        System.out.println("Singleton is working.");
    }
}