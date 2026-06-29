package com.afffinty.interview.Concurrency.philosopher_dinner;

import com.afffinty.interview.Concurrency.philosopher_dinner.aux.Chopstick;

import java.util.Random;

public class PhilosopherNaive extends Thread {

    private Chopstick left, right;
    private Random random;

    public PhilosopherNaive(Chopstick left, Chopstick right) {
        this.left = left;
        this.right = right;
    }

    public void run() {
        try  {
            while(true) {
                Thread.sleep(random.nextInt(1000)); // Think for a while.
                synchronized (left) { // grab left chapstick
                    synchronized (right) { // grab the right one
                        Thread.sleep(random.nextInt(1000)); //eat for awhile
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
