package com.example.Users.model;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String username;

    public User(){

    }

    public User(String firstName, String lastName, int age, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
