package com.nology.users;

import java.util.Scanner;

public class Administrator extends User {
    private Scanner scanner = new Scanner(System.in);
    MockUsers users = new MockUsers();

    public Administrator() {
    };

    public Administrator(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void login() {
        System.out.println("Hello, please enter your Admin last name to login: ");
        String adminLastName = scanner.next();

        for (Administrator admin: users.getAdmins()
             ) {
                if(admin.getLastName().equals(adminLastName)){
                    System.out.println("You are logged in!");
                    System.out.println("Press 1 to continue");
                    scanner.next();
                    selectAction();
                }

        }
        System.out.println("Name not found...");
        System.out.println("Press 2 to continue");
        scanner.next();
        login();
    }

    public void selectAction() {
        System.out.println("Select an option: \n1- Create a new Student \n2- Create a new Lecturer");
        int option = scanner.nextInt();
        if(option == 1) {
            createNewStudent();
            System.out.println(new Student().showStudentDetails());
        } else if (option == 2) {
            createNewLecturer();
        }
    }

    public void createNewStudent() {
        System.out.println("Please enter the Student's lastname: ");
        String studentLastName = scanner.next();
        System.out.println("Please enter the Student's firstname: ");
        String studentFirstName = scanner.next();
        System.out.println("Please enter the Student's year group: ");
        int studentYearGroup = scanner.nextInt();

        Student student = new Student(studentFirstName, studentLastName);
        student.setYearGroup(studentYearGroup);
        System.out.println("You created " + student.firstName + " " + student.lastName + " as a Student");

    }

    public void createNewLecturer() {
        System.out.println("helllllo");
    }
//fake admin database, 3 set users?

//    methods: login as admin/validate
//    view students
//    enroll students
//    setaccount details for students


}
