package com.afffinty.interview.Collections;

import java.util.List;

public class ShallowCopy implements Cloneable {

    private String name;
    private int age;
    private List<String> skills; // mutable shared reference

    public ShallowCopy(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    /**
     * SHALLOW COPY IMPLEMENTATION
     */
    @Override
    public ShallowCopy clone() {
        try {
            return (ShallowCopy) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
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

    // Setters (for testing mutation effects)
    public void setName(String name) {
        this.name = name;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }
}