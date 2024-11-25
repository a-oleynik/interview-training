package com.oleynik.interviewtraining.lesson1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cache<K, V> {
    private final Map<K, V> cache = new HashMap<>();

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void remove(K key) {
        cache.remove(key);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cache<?, ?> cache1 = (Cache<?, ?>) o;
        return Objects.equals(cache, cache1.cache);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cache);
    }

    @Override
    public String toString() {
        return cache.toString();
    }

    public static void main(String[] args) {
        Cache<String, Integer> cache = new Cache<>();
        cache.put("key1", 1);
        cache.put("key2", 2);
        cache.put("key3", 3);
        System.out.println(cache);
        System.out.println(cache.get("key1"));
        System.out.println(cache.get("key2"));
        System.out.println(cache.get("key3"));
        cache.remove("key1");
        System.out.println(cache);
    }
}
