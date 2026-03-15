package oProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user {
    public String name;
    public String userName;
    // public String Age; not needed for prototype
    public String nationality;
    // public String email; not needed in prototype
    public String password;
    public float handicap;
    public List<String> followList = new ArrayList<>();
    public String homeCourse;
    Scanner myObj = new Scanner(System.in); // initialize scanner

    public void createUser() {

        System.out.print("\n Enter User Name: "); // must add user name check
        userName = myObj.nextLine();

        System.out.print("\n Enter Your Password: ");
        password = myObj.nextLine();

        System.out.print("\n Enter Your Full Name: ");
        name = myObj.nextLine();

        System.out.print("\n Enter Your Nationality: ");
        nationality = myObj.nextLine();

        System.out.print("\n Enter Your handiCap: ");
        handicap = myObj.nextFloat();

        System.out.print("\n Enter Your HomeCourse: ");
        homeCourse = myObj.nextLine();

        myObj.nextLine();
    }

}
