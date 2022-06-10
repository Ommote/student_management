package com.nology.users;

import java.util.Arrays;
import java.util.Random;

public abstract class User {
    String firstName;
    String lastName;
    String userName;
    String emailAddress;
    String password;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    generate username based off initials and random numbers
//    generate random password
//    generate uni email based on name + uni/faculty

    public abstract void login();

    public String generateEmail() {
        return this.firstName + "." + this.lastName + "@nologyuniversity.ac.uk";
    }

    public String generateUserName() {
        String userName = "";
        int[] userNameNumbers = new int[7];
        int upperbound = 9;
        for(int i = 0; i < 7; i++) {
            Random randomNum = new Random();
            userNameNumbers[i] = randomNum.nextInt(upperbound);
            for (int element : userNameNumbers
                 ) {
                System.out.println(element);

            }
        }

        return String.valueOf(this.firstName.charAt(0)) + Arrays.toString(userNameNumbers) + String.valueOf(this.lastName.charAt(0));
    }


}
