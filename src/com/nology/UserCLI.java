package com.nology;

import com.nology.users.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCLI {
    private Scanner scanner = new Scanner(System.in);
//    private List<Administrator> admins = new ArrayList<>();

    public UserCLI() {
    }

//    public void createAdmins(String firstname, String lastName) {
//        admins.add(new Administrator(firstname, lastName));
//    }
//    needs further abstraction of list of admins! or replace with CSV file/actual database.

    //    Method to choose what kind of user
    public void loginToSystem() {
        System.out.println("Hello, welcome to _nology University!");
        System.out.println("Please select an option to login: \n1 - Admin Login \n2 - Lecturer Login " +
                "\n3 - Student Login");
        int userSelection = scanner.nextInt();
        if (userSelection == 1) {
            Administrator admin = new Administrator();
//            shouldn't create admin but rather access a list of admins to validate login?
            admin.login();
        } else if (userSelection == 2) {
            Lecturer lecturer = new Lecturer();
            lecturer.login();
        } else if (userSelection == 3) {
            Student student = new Student();
            student.login();

        }
    }

    public static void main(String[] args) {

        MockUsers users = new MockUsers();
        users.createAdmins("Olivia", "Motevalli");
        users.createAdmins("Henny", "Pom");

        UserCLI user1 = new UserCLI();

        user1.loginToSystem();

    }
}
//        1. user can login to system as an Admin, Lecturer or Student[XX]
//        **ADMIN**
//        2. can create new users (Lecturer or Student)[ ]
//        3. can view info on users[ ]
//        4. can enroll a student onto a course[ ]
//        5. can view previous grades[ ]
//        6. update personal details & account settings (password, etc)[ ]
//        **LECTURER**
//        7. can view which courses you teach[ ]
//        8. can grade students[ ]
//        9. can set homework?[ ]
//        **STUDENT**
//        10. can enroll into new courses[ ]
//        11. can check course prerequisites[ ]
//        12. can view previous grades[ ]
//        13. can view status (including which courses currently enrolled on)[ ]