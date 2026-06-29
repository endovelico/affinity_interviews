package com.afffinty.interview.Collections.cache;

import java.util.*;
import java.util.concurrent.*;

/**
 * Interview Exercise:
 * Implement missing caching strategies.
 *
 * You are given:
 * - cache (fast storage)
 * - database (slow storage simulation)
 *
 * Complete all TODOs.
 */
public class Cache<K, V> {

    protected final Map<K, V> cache = new ConcurrentHashMap<>();
    protected final Map<K, V> database = new ConcurrentHashMap<>();

    // Used only for write-behind
    protected final Queue<Map.Entry<K, V>> writeQueue = new ConcurrentLinkedQueue<>();

    protected final ScheduledExecutorService executor =
            Executors.newSingleThreadScheduledExecutor();

    public Cache() {
        // TODO: start background flush for write-behind
        // Hint: periodically call flushWrites()
    }

    // =========================================================
    // 1. CACHE ASIDE
    // =========================================================

    public V cacheAsideRead(K key) {
        // TODO:
        // 1. Check cache
        // 2. If miss -> load from DB
        // 3. Store in cache
        // 4. Return value
        return null;
    }

    public void cacheAsideWrite(K key, V value) {
        // TODO:
        // 1. Write to DB
        // 2. Invalidate cache entry
    }

    // =========================================================
    // 2. READ THROUGH
    // =========================================================

    public V readThrough(K key) {
        // TODO:
        // Hint: cache is responsible for loading data if missing
        return null;
    }

    // =========================================================
    // 3. WRITE THROUGH
    // =========================================================

    public void writeThrough(K key, V value) {
        // TODO:
        // 1. Write to cache
        // 2. Write to DB immediately
    }

    // =========================================================
    // 4. WRITE BEHIND (WRITE BACK)
    // =========================================================

    public void writeBehind(K key, V value) {
        // TODO:
        // 1. Write only to cache
        // 2. Add to async write queue
    }

    protected void flushWrites() {
        // TODO:
        // 1. Drain queue
        // 2. Persist all entries to DB
        // 3. Handle safely if queue is empty
    }

    // =========================================================
    // 5. WRITE AROUND
    // =========================================================

    public void writeAround(K key, V value) {
        // TODO:
        // 1. Write ONLY to DB
        // 2. Invalidate cache
    }

    // =========================================================
    // HELPERS (DO NOT CHANGE)
    // =========================================================

    public V getFromCache(K key) {
        return cache.get(key);
    }

    public V getFromDb(K key) {
        return database.get(key);
    }

    public void shutdown() {
        executor.shutdown();
    }
}