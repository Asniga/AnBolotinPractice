package com.myProject.model;

public class User {
    private String name;
    private String email;



    public User setName(String name) {
        this.name = name;
        return this;
         }


    public User setEmail(String email) {
        this.email = email;
        return this;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
