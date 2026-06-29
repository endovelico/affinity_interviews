package com.afffinty.interview.Collections.solution;

import java.util.HashMap;
import java.util.Map;

public class BagSolution<E> {

    private final Map<E, Integer> map = new HashMap<>();

    public void add(E element) {
        map.put(element, map.getOrDefault(element, 0) + 1);
    }

    public boolean remove(E element) {
        Integer count = map.get(element);
        if (count == null) return false;

        if (count <= 1) {
            map.remove(element);
        } else {
            map.put(element, count - 1);
        }
        return true;
    }

    public int count(E element) {
        return map.getOrDefault(element, 0);
    }

    public int size() {
        int total = 0;
        for (int count : map.values()) {
            total += count;
        }
        return total;
    }

    public int uniqueSize() {
        return map.size();
    }

    public boolean contains(E element) {
        return map.containsKey(element);
    }
}