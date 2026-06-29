package com.afffinty.interview.Collections;

import java.util.HashMap;
import java.util.Map;

public class Bag<E> {

    private final Map<E, Integer> map = new HashMap<>();

    /**
     * Adds one occurrence of the element.
     * Time Complexity: O(1) average (HashMap put/get)
     * Space Complexity: O(1) amortized per insert (O(n) total storage across all elements)
     */
    public void add(E element) {
        map.put(element, map.getOrDefault(element, 0) + 1);
    }

    /**
     * Removes one occurrence of the element.
     * Returns true if element existed.
     * Time Complexity: O(1) average
     * Space Complexity: O(1) (may free memory when count hits 0)
     */
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

    /**
     * Returns number of occurrences of the element.
     * Time Complexity: O(1) average
     * Space Complexity: O(1)
     */
    public int count(E element) {
        return map.getOrDefault(element, 0);
    }

    /**
     * Returns total number of elements including duplicates.
     * Time Complexity: O(k), where k = number of distinct elements
     * Space Complexity: O(1)
     */
    public int size() {
        int total = 0;
        for (int value : map.values()) {
            total += value;
        }
        return total;
    }

    /**
     * Returns number of distinct elements.
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public int uniqueSize() {
        return map.size();
    }

    /**
     * Checks if element exists in the multiset.
     * Time Complexity: O(1) average
     * Space Complexity: O(1)
     */
    public boolean contains(E element) {
        return map.containsKey(element);
    }
}
