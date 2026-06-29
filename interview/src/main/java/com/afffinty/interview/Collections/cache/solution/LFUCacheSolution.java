package com.afffinty.interview.Collections.cache.solution;

import java.util.*;

public class LFUCacheSolution<K, V> {

    private final int capacity;

    // Key → Node (O(1) access to value)
    private final Map<K, Node> cache;

    // Key → Frequency
    private final Map<K, Integer> keyFreq;

    // Frequency → Keys (ordered to break ties using LRU)
    private final Map<Integer, LinkedHashSet<K>> freqMap;

    private int minFreq;

    public LFUCacheSolution(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.keyFreq = new HashMap<>();
        this.freqMap = new HashMap<>();
        this.minFreq = 0;
    }

    // ----------------------------
    // GET
    // ----------------------------
    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }

        Node node = cache.get(key);
        increaseFrequency(key);
        return node.value;
    }

    // ----------------------------
    // PUT
    // ----------------------------
    public void put(K key, V value) {
        if (capacity == 0) return;

        if (cache.containsKey(key)) {
            cache.get(key).value = value;
            increaseFrequency(key);
            return;
        }

        if (cache.size() >= capacity) {
            evictLFU();
        }

        Node node = new Node(key, value);
        cache.put(key, node);

        keyFreq.put(key, 1);
        addToFrequencyList(key, 1);

        minFreq = 1;
    }

    // ----------------------------
    // FREQUENCY UPDATE
    // ----------------------------
    private void increaseFrequency(K key) {
        int freq = keyFreq.get(key);

        removeFromFrequencyList(key, freq);

        // If current freq bucket is empty and was minFreq, update minFreq
        if (freqMap.get(freq).isEmpty()) {
            freqMap.remove(freq);
            if (freq == minFreq) {
                minFreq++;
            }
        }

        int newFreq = freq + 1;
        keyFreq.put(key, newFreq);
        addToFrequencyList(key, newFreq);
    }

    // ----------------------------
    // EVICTION
    // ----------------------------
    private void evictLFU() {
        LinkedHashSet<K> keys = freqMap.get(minFreq);

        // Evict LRU among LFU (first inserted in LinkedHashSet)
        K evictKey = keys.iterator().next();

        keys.remove(evictKey);

        if (keys.isEmpty()) {
            freqMap.remove(minFreq);
        }

        cache.remove(evictKey);
        keyFreq.remove(evictKey);
    }

    // ----------------------------
    // HELPERS
    // ----------------------------
    private void addToFrequencyList(K key, int freq) {
        freqMap.computeIfAbsent(freq, f -> new LinkedHashSet<>()).add(key);
    }

    private void removeFromFrequencyList(K key, int freq) {
        LinkedHashSet<K> set = freqMap.get(freq);
        if (set != null) {
            set.remove(key);
        }
    }

    // ----------------------------
    // NODE CLASS
    // ----------------------------
    private class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}