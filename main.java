package oProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class main {

    public static void main(String[] args) {
        System.out.println(
                "___________________________________\n \n             GMEDIA\n___________________________________\n");
        List<Course> courseList = new ArrayList<>();
        Course c = new Course();
        c.setName("Muskerry Golf Club");
        c.setPars(new Integer[] { 4, 4, 5, 4, 4, 3, 5, 3, 4, 4, 4, 3, 4, 5, 3, 4, 4, 4 });
        c.setLocation("Cork");
        c.setTee("White");
        c.setHoles(18);
        c.setRecord(67);
        c.setIndex(47.5);

        courseList.add(c);
        c = new Course();
        c.setName("Lee Vally Golf Club");
        c.setPars(new Integer[] { 3, 4, 5, 6, 7, 8, 4, 2, 2, 5, 5, 3, 2, 3, 3, 5, 5, 4 });
        c.setLocation("Cork");
        c.setTee("Red");
        c.setRecord(67);
        c.setIndex(47.5);
        courseList.add(c);
        // System.out.println(courseList);
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i).name);
            System.out.println(Arrays.toString(courseList.get(i).pars));
            System.out.println("Par: " + courseList.get(i).par);
            System.out.println("Holes: " + courseList.get(i).holes);
            System.out.println("Location: " + courseList.get(i).location);
            System.out.println("Tees: " + courseList.get(i).tee);
            System.out.println("Course Record: " + courseList.get(i).record);
            System.out.println("Course Index: " + courseList.get(i).index);
            System.out.println("\nPress " + (i + 1) + " to Start Round");
            System.out.println("\n--------------------------------------------------\n");

        }
    }
}
