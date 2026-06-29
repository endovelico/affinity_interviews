package com.afffinty.interview.Concurrency;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Fully immutable class example
 */
public final class Immutable {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public Immutable(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;

        // Defensive copy to prevent external mutation
        this.hobbies = Collections.unmodifiableList(
                new ArrayList<>(hobbies)
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        // Safe because it's already unmodifiable,
        // but returning reference is fine due to immutability guarantee
        return hobbies;
    }

    // No setters → state cannot change
}
