package main.java.com.afffinty.interview.EXERCISES;

import main.java.com.afffinty.interview.EXERCISES.RESULTS.Tuple;

public class TupleQuestion {

    public TupleQuestion() {
        Tuple<String, Integer> p = new Tuple<>("Alice", 25);

        System.out.println(p.first());
        System.out.println(p.second());
    }
}
