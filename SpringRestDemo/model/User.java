package com.gfg.abhay.SpringRestDemo.model;

public class User {
    private Long Id;
    private String FirstName;
    private String LastName;

    public User() {
    }

    public User(Long id, String firstName, String lastName) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
