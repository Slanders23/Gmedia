package oProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
    public String name;
    public Integer par = 0;
    public List<Integer> pars = new ArrayList<>();
    public Integer holes;
    public String location;
    public String tee;
    public Integer record;
    public double index;
    Scanner myObj = new Scanner(System.in); // initialize scanner

    public void setCourse() {
        System.out.print("\n Enter Golf Course Name: ");
        name = myObj.nextLine();

        System.out.print("\n Enter how many Holes: ");
        holes = myObj.nextInt();

        for (int i = 1; i <= this.holes; i++) {
            System.out.print("\n Enter par for Hole " + i + ": ");
            pars.add(myObj.nextInt());
        }
        for (int i = 0; i < this.holes; i++) {
            par += pars.get(i);
        }

        myObj.nextLine();
        System.out.print("\n Enter Golf Course Location: ");
        location = myObj.nextLine();

        System.out.print("\n Enter Course Record: ");
        record = myObj.nextInt();
        myObj.nextLine();

        System.out.print("\n Enter Course Index: ");
        index = myObj.nextDouble();

    }

    public void setName(String newName) {
        name = newName;
    }

    public void setHoles(Integer setHoles) {
        holes = setHoles;
    }

    public void setPars(List<Integer> newPars) {
        pars = newPars;
        for (int i = 0; i < this.holes; i++) {
            par += pars.get(i);
        }

    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public void setTee(String newTee) {
        tee = newTee;
    }

    public void setRecord(Integer newRecord) {
        record = newRecord;
    }

    public void setIndex(double newIndex) {
        index = newIndex;
    }

}
