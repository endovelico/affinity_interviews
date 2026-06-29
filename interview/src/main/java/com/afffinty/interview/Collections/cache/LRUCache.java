package com.afffinty.interview.Collections.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {

    private final int capacity;

    // Key → Node lookup (O(1))
    private final Map<K, Node> cache;

    // Dummy head/tail to simplify edge cases
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        this.head = new Node(null, null);
        this.tail = new Node(null, null);

        head.next = tail;
        tail.prev = head;
    }

    // ----------------------------
    // GET
    // ----------------------------
    public V get(K key) {
        if (!cache.containsKey(key)) {
            return null;
        }

        Node node = cache.get(key);

        // TODO: move node to front (most recently used)
        moveToFront(node);

        return node.value;
    }

    // ----------------------------
    // PUT
    // ----------------------------
    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;

            // TODO: move updated node to front
            moveToFront(node);
            return;
        }

        if (cache.size() >= capacity) {
            // TODO: evict least recently used node
            evictLRU();
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);

        // TODO: insert new node at front
        addToFront(newNode);
    }

    // ----------------------------
    // CORE OPERATIONS (TO IMPLEMENT)
    // ----------------------------

    /**
     * Move an existing node to the front (MRU position)
     */
    private void moveToFront(Node node) {
        // TODO:
        // 1. remove node from current position
        // 2. add it to front
    }

    /**
     * Add node right after head (MRU position)
     */
    private void addToFront(Node node) {
        // TODO: implement pointer updates
    }

    /**
     * Remove a node from the linked list
     */
    private void removeNode(Node node) {
        // TODO: implement pointer updates
    }

    /**
     * Evict least recently used node (node before tail)
     */
    private void evictLRU() {
        // TODO:
        // 1. get LRU node (tail.prev)
        // 2. remove from list
        // 3. remove from map
    }

    // ----------------------------
    // NODE CLASS
    // ----------------------------
    private class Node {
        K key;
        V value;
        Node prev;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}