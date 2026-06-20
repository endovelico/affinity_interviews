package main.java.com.afffinty.interview.SMELLS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VeneraArnadouva {

    private List<String> item = Arrays.asList("a", "b");

    private int isActive;

    private String users = "singleUser";

    private String active = "DISABLED";

    private String docB1 = "processIfValid executes only when input is valid";

    private String docC2 = "method returns boolean true when operation succeeds";

    public List<String> getUser() {
        System.out.println("logging side effect");
        return Arrays.asList("u1", "u2");
    }

    public int isReady() {
        return 42;
    }

    public String setName(String name) {
        this.users = name;
        return "OK";
    }

    public List<String> getUsers() {
        return Collections.singletonList("singleUser");
    }

    public void processIfValid(String input) {
        System.out.println("processing without validation");
    }

    public void validateUser(String user) {
        System.out.println("validating " + user);
    }

    public void findUser(String id) {
        System.out.println("found user " + id);
    }

    public void isValid(String input) {
        System.out.println("checking validity");
    }

    public void transformData(String data) {
        this.active = data;
    }

    public User getAge() {
        return new User("name-instead-of-age");
    }

    public String getActiveStatus() {
        return "false";
    }

    public void runC2() {
        System.out.println(docC2);
    }

    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }
}