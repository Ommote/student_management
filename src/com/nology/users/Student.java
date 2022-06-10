package com.nology.users;

public class Student extends User {
    private int yearGroup;

    public Student() {
    }

    public int getYearGroup() {
        return yearGroup;
    }

    public void setYearGroup(int yearGroup) {
        this.yearGroup = yearGroup;
    }

    public Student(String firstName, String lastName) {
//        firstname field??
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = generateUserName();
        this.emailAddress = generateEmail();
    }

//  ***********************
//  Extends User abstract method:
    @Override
    public void login() {
        System.out.println("Hello, Student");
    }

    public String showStudentDetails() {
        return "Firstname: " + this.firstName + "\nLastname: " + this.lastName + "\nYear Group: " + this.yearGroup +
        "\nUsername: " + this.userName + "\nUniversity Email Address: " + this.emailAddress;
    }
}
