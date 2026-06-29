package com.afffinty.interview.Collections.cache.solution;

import java.util.*;
import java.util.concurrent.*;

/**
 * Demonstrates multiple caching strategies:
 * - Cache Aside
 * - Read Through
 * - Write Through
 * - Write Behind (Write Back)
 * - Write Around
 */
public class CacheSolution<K, V> {

    // Simulated cache
    private final Map<K, V> cache = new ConcurrentHashMap<>();

    // Simulated DB
    private final Map<K, V> database = new ConcurrentHashMap<>();

    // Queue for write-behind
    private final Queue<Map.Entry<K, V>> writeQueue = new ConcurrentLinkedQueue<>();

    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public CacheSolution() {
        // Background flush for write-behind
        executor.scheduleAtFixedRate(this::flushWrites, 1, 1, TimeUnit.SECONDS);
    }

    // =========================================================
    // 1. CACHE ASIDE (Lazy Loading)
    // =========================================================

    public V cacheAsideRead(K key) {
        V value = cache.get(key);
        if (value != null) return value;

        // Load from DB
        value = database.get(key);

        if (value != null) {
            cache.put(key, value);
        }

        return value;
    }

    public void cacheAsideWrite(K key, V value) {
        database.put(key, value);
        cache.remove(key); // invalidate cache
    }

    // =========================================================
    // 2. READ THROUGH
    // Cache handles loading automatically
    // =========================================================

    public V readThrough(K key) {
        return cache.computeIfAbsent(key, k -> database.get(k));
    }

    // =========================================================
    // 3. WRITE THROUGH
    // Write to cache AND DB immediately
    // =========================================================

    public void writeThrough(K key, V value) {
        database.put(key, value);
        cache.put(key, value);
    }

    // =========================================================
    // 4. WRITE BEHIND (WRITE BACK)
    // Write to cache only, DB updated async
    // =========================================================

    public void writeBehind(K key, V value) {
        cache.put(key, value);
        writeQueue.add(new AbstractMap.SimpleEntry<>(key, value));
    }

    private void flushWrites() {
        while (!writeQueue.isEmpty()) {
            Map.Entry<K, V> entry = writeQueue.poll();
            if (entry != null) {
                database.put(entry.getKey(), entry.getValue());
            }
        }
    }

    // =========================================================
    // 5. WRITE AROUND
    // Write goes ONLY to DB, cache is bypassed
    // =========================================================

    public void writeAround(K key, V value) {
        database.put(key, value);
        cache.remove(key); // ensure stale cache isn't used
    }

    // =========================================================
    // Helpers (for testing)
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
