package com.project;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println(
                "___________________________________\n \n             GMEDIA\n___________________________________\n");
        List<Course> courseList = new ArrayList<>();
        List<user> userList = new ArrayList<>();
        List<post> postList = new ArrayList<>();
        // ObjectMapper objectMapper = new ObjectMapper();

        boolean active = true;
        String menu;
        user loggedIn = null;
        Integer choice;
        String postTemp;

        // set Courses
        Course c = new Course();
        c.setName("Muskerry Golf Course");
        c.setHoles(18);
        c.setPars(List.of(4, 4, 5, 4, 4, 3, 5, 3, 4, 4, 4, 3, 4, 5, 3, 4, 4, 4));
        c.setLocation("Cloghroe");
        c.setRecord(63);
        c.setIndex(131);
        courseList.add(c);
        c = new Course();
        c.setName("Lee Valley Golf Course");
        c.setHoles(18);
        c.setPars(List.of(4, 4, 3, 5, 4, 3, 4, 5, 4, 4, 5, 3, 4, 4, 5, 3, 4, 4));
        c.setLocation("Ovens");
        c.setRecord(66);
        c.setIndex(143);
        courseList.add(c);
        c = new Course();
        c.setName("Fota Golf Course");
        c.setHoles(18);
        c.setPars(List.of(4, 4, 3, 5, 5, 4, 3, 4, 4, 5, 3, 4, 3, 4, 4, 4, 3, 5));
        c.setLocation("Fota Island");
        c.setRecord(63);
        c.setIndex(137);
        courseList.add(c);
        System.out.println(courseList);

        Scanner myObj = new Scanner(System.in); // initialize scanner
        while (active) {
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(
                    " |Enter 'z' for courses| |Enter 'x' for FYP| |Enter 'y' for Friends| Enter 'c' for Profile| |Enter 'v' for Settings|  ");
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------- ");
            menu = myObj.next();

            // ==========================================================================
            // Settings Menu
            // ==========================================================================

            if (menu.equals("v")) {

                System.out.println("Enter 1 to add new user: ");
                System.out.println("Enter 2 to add new Course: ");

                choice = myObj.nextInt();
                myObj.nextLine();
                // ======================================
                // Creating new user
                // ====================================
                if (choice == 1) {
                    user u = new user();
                    u.createUser();
                    userList.add(u);
                    System.out.println(u);
                }
                // ---------------------------------------------------------
                // Creating a new Golf Course
                // ---------------------------------------------------------
                if (choice == 2) {
                    c = new Course();
                    c.setCourse();
                    courseList.add(c);
                }

            } else if (menu.equals("c")) {
                if (loggedIn != null) {
                    System.out.println("logged in as " + loggedIn.name + "Following" + loggedIn.followList.size());
                    System.out.println("Enter 1 to veiw Follow list");
                    System.out.println("Enter 2 to logOut");
                    myObj.nextLine();
                    postTemp = myObj.nextLine();

                    if (postTemp.equals("1")) {
                        System.out.println("Following" + loggedIn.followList.toString());
                    } else if (postTemp.equals("2")) {
                        loggedIn = null;
                        System.out.println("Succesfully logged out");
                    }
                } else {
                    System.out.println("Enter 1 to Create Account: ");
                    System.out.println("Enter 2 to LogIn: ");
                    choice = myObj.nextInt();
                    myObj.nextLine();
                    // ====
                    // create user
                    // =====
                    if (choice == 1) {
                        user u = new user();
                        u.createUser();
                        // objectMapper.writeValue(new File("users.json"), u);
                        userList.add(u);
                    }
                    // ---------------------------------------------------------
                    // login
                    // ---------------------------------------------------------
                    if (choice == 2) {

                        System.out.println("-----------------------------");
                        System.out.println("            Login");
                        System.out.println("-----------------------------");
                        System.out.println("Enter User Name: ");
                        String tempUserName = myObj.nextLine();
                        System.out.println("Enter Password: ");
                        String tempUserPassword = myObj.nextLine();
                        for (int us = 0; us < userList.size(); us++) {
                            if (userList.get(us).userName.equals(tempUserName)) {
                                if (userList.get(us).password.equals(tempUserPassword)) {
                                    loggedIn = userList.get(us);
                                }
                            }
                        }
                    }
                }

                // Courses
            } else if (menu.equals("z")) {
                System.out.println("\n--------------------------------------------------\n");
                Integer courseSelectTemp = 0;
                for (int i = 0; i < courseList.size(); i++) {

                    System.out.println(courseList.get(i).name);
                    System.out.println(courseList.get(i).pars.toString());
                    System.out.println("Par: " + courseList.get(i).par);
                    System.out.println("Holes: " + courseList.get(i).holes);
                    System.out.println("Location: " + courseList.get(i).location);
                    // System.out.println("Tees: " + courseList.get(i).tee);
                    System.out.println("Course Record: " + courseList.get(i).record);
                    System.out.println("Course Index: " + courseList.get(i).index);
                    System.out.println("\nPress " + (i + 1) + " to Start Round");
                    System.out.println("\n--------------------------------------------------\n");
                }
                try {
                    courseSelectTemp = myObj.nextInt();
                } catch (Exception e) {
                }

                if (courseSelectTemp > 0) {
                    if (loggedIn != null) {
                        post p = new post();
                        System.out.println("You Have selected " + courseList.get(courseSelectTemp - 1).name);

                        p.setCourseObj(courseList.get(courseSelectTemp - 1));
                        p.setUserObj(loggedIn);
                        p.setPost();
                        postList.add(p);
                        // System.out.println(p.Course);

                    } else {
                        System.err.println("Must be Logged in");
                    }
                }
            } else if (menu.equals("x")) {
                for (Integer i = 0; i < postList.size(); i++) {
                    System.out.println(postList.get(i).userObj.name + "                           16/03 ");
                    System.out.println(postList.get(i).CourseObj.name + "                            ");
                    System.out.println(postList.get(i).CourseObj.pars.toString() + "  par|"
                            + postList.get(i).CourseObj.par + "|  ");
                    System.out.println(
                            postList.get(i).scoreList.toString() + " score|" + postList.get(i).totalScore + " |  ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                        /|                     |");
                    System.out.println("|                       / |                     |");
                    System.out.println("|                      /  |                     |");
                    System.out.println("|                     /   |                     |");
                    System.out.println("|                    /____|                     |");
                    System.out.println("|                         |                     |");
                    System.out.println("|                         |                     |");
                    System.out.println("|                         |                     |");
                    System.out.println("|                    O    |                     |");
                    System.out.println("|                         |     O               |");
                    System.out.println("-------------------------------------------------");
                    System.out.println(postList.get(i).description);
                    System.out.println(
                            "likes: " + postList.get(i).likes + "                               comments "
                                    + postList.get(i).comments.size());

                    System.out.println(
                            "Press 1 to follow, Press 2 to Like ,Press 3 to view comments, Press 4 to Comment ");
                    myObj.nextLine();
                    postTemp = myObj.nextLine();
                    if (postTemp.equals("2")) {
                        postList.get(i).setLike();
                    } else if (postTemp.equals("1")) {
                        if (loggedIn.followList.contains(postList.get(i).userObj.name)) {
                            System.out.println("Cannt follow");
                        } else {
                            loggedIn.followList.add(postList.get(i).userObj.name);
                            System.out.println("now following" + loggedIn.followList.toString());
                        }
                    }
                }
            }
        }
    }
}
