package oProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class main {

    public static void main(String[] args) {
        System.out.println(
                "___________________________________\n \n             GMEDIA\n___________________________________\n");
        List<Course> courseList = new ArrayList<>();
        boolean active = true;
        String menu;
        Integer choice;
        Scanner myObj = new Scanner(System.in); // initialize scanner
        while (active) {
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------- ");
            System.out.println(
                    " |Enter 'z' for courses| |Enter 'x' for FYP| |Enter 'y' for Friends| Enter 'c' for Profile| |Enter 'v' for Settings|  ");
            System.out.println(
                    "--------------------------------------------------------------------------------------------------------------------- ");
            menu = myObj.next();

            if (menu.equals("v")) {

                System.out.println("Enter 1 to add new user: ");
                System.out.println("Enter 2 to add new Course: ");
                choice = myObj.nextInt();
                myObj.nextLine();

                if (choice == 1) {

                }
                // ---------------------------------------------------------
                // Creating a new Golf Course
                // ---------------------------------------------------------
                if (choice == 2) {
                    Course c = new Course(); // Initialize Course class
                    c.setCourse();
                    courseList.add(c);
                }
            } else if (menu.equals("z")) {
                System.out.println("\n--------------------------------------------------\n");
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
            }
        }
    }
}
