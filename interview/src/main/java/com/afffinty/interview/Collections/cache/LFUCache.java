package com.afffinty.interview.Collections.cache;

import java.util.*;

public class LFUCache<K, V> {

    private final int capacity;

    // Key → Node (for O(1) access)
    private final Map<K, Node> cache;

    // Frequency → LinkedHashSet of keys (preserves order for tie-breaking)
    private final Map<Integer, LinkedHashSet<K>> freqMap;

    // Key → Frequency
    private final Map<K, Integer> keyFreq;

    private int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
        this.keyFreq = new HashMap<>();
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

        // TODO: update frequency of this key
        increaseFrequency(key);

        return node.value;
    }

    // ----------------------------
    // PUT
    // ----------------------------
    public void put(K key, V value) {
        if (capacity <= 0) return;

        if (cache.containsKey(key)) {
            // Update value and frequency
            cache.get(key).value = value;

            // TODO: update frequency
            increaseFrequency(key);
            return;
        }

        // Evict if full
        if (cache.size() >= capacity) {
            evictLFU();
        }

        // Insert new node
        Node node = new Node(key, value);
        cache.put(key, node);

        // Initialize frequency
        keyFreq.put(key, 1);

        // TODO: add to freqMap correctly
        addToFrequencyList(key, 1);

        minFreq = 1;
    }

    // ----------------------------
    // CORE OPERATIONS (TO BE COMPLETED)
    // ----------------------------

    /**
     * Increase frequency of a key:
     * - remove from old frequency bucket
     * - add to new frequency bucket
     * - update minFreq if needed
     */
    private void increaseFrequency(K key) {
        // TODO: implement
    }

    /**
     * Evict least frequently used key:
     * - find minFreq bucket
     * - remove least recently used key in that bucket
     * - clean up all maps
     */
    private void evictLFU() {
        // TODO: implement
    }

    /**
     * Add key to a frequency bucket
     */
    private void addToFrequencyList(K key, int freq) {
        // TODO: implement
    }

    /**
     * Remove key from a frequency bucket
     */
    private void removeFromFrequencyList(K key, int freq) {
        // TODO: implement
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