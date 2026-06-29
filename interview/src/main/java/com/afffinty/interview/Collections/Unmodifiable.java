package com.afffinty.interview.Collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Fully unmodifiable (immutable) class
 */
public final class Unmodifiable {

    private final String name;
    private final int age;
    private final List<String> skills;

    /**
     * Constructor performs defensive copy
     */
    public Unmodifiable(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;

        // Defensive copy + wrap as unmodifiable
        this.skills = Collections.unmodifiableList(new ArrayList<>(skills));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Safe exposure: returns unmodifiable list
     */
    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", skills=" + skills + "}";
    }
}
