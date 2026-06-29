package com.afffinty.interview.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefensiveCopy {

    private String name;
    private int age;
    private List<String> skills;

    /**
     * Constructor with defensive copy
     */
    public DefensiveCopy(String name, int age, List<String> skills) {
        this.name = name;
        this.age = age;

        // Defensive copy of input list
        this.skills = new ArrayList<>(skills);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /**
     * Defensive copy on getter
     * Prevents external modification of internal list
     */
    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    /**
     * Optional: safer alternative (unmodifiable view)
     */
    public List<String> getSkillsUnmodifiable() {
        return Collections.unmodifiableList(skills);
    }

    /**
     * Defensive copy in setter
     */
    public void setSkills(List<String> skills) {
        this.skills = new ArrayList<>(skills);
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", skills=" + skills + "}";
    }
}
