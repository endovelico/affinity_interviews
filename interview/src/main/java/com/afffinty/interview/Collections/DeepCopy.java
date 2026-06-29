package com.afffinty.interview.Collections;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {

    private String name;
    private int age;
    private List<String> skills;

    public DeepCopy(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    /**
     * 🔥 DEEP COPY CONSTRUCTOR
     */
    public DeepCopy(DeepCopy other) {
        this.name = other.name;
        this.age = other.age;

        // Deep copy of mutable field
        this.skills = new ArrayList<>(other.skills);
    }

    /**
     * Alternative deep copy method
     */
    public DeepCopy deepCopy() {
        return new DeepCopy(this);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    // Mutators (for testing)
    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void setName(String name) {
        this.name = name;
    }
}
