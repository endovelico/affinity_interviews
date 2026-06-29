package com.afffinty.interview.Collections.cache.solution;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheSolution<K, V> {

    private final int capacity;

    private final Map<K, Node> cache;

    // Dummy head and tail nodes
    private final Node head;
    private final Node tail;

    public LRUCacheSolution(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        head = new Node(null, null);
        tail = new Node(null, null);

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
            moveToFront(node);
            return;
        }

        if (cache.size() >= capacity) {
            evictLRU();
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        addToFront(newNode);
    }

    // ----------------------------
    // CORE OPERATIONS
    // ----------------------------

    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void evictLRU() {
        Node lru = tail.prev;

        if (lru == head) return; // safety check

        removeNode(lru);
        cache.remove(lru.key);
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
