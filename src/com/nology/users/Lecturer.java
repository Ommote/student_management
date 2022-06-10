package com.nology.users;

public class Lecturer extends User {

    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName) {
//        super(firstName, lastName);
//        this.emailAddress = generateEmail();
    }

    @Override
    public void login() {
        System.out.println("Hello, Lecturer");
    }

}
