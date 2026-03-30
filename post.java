package oProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oProject.Course;
import oProject.user;

public class post {
    Scanner myObj = new Scanner(System.in); // initialize scanner
    public user userObj;
    public Course CourseObj;
    public List<Integer> scoreList = new ArrayList<>();
    public Integer totalScore = 0;
    public String description;
    public Integer likes = 0;
    public List<String> comments = new ArrayList<>();

    public void setCourseObj(Course newCourseObj) {
        CourseObj = newCourseObj;
    }

    public void setUserObj(user newUserObj) {
        userObj = newUserObj;
    }

    public void setLike() {
        likes += 1;
    }

    public void setPost() {
        for (int i = 1; i <= CourseObj.holes; i++) {
            System.out.print("\n Enter par for Hole " + i + "[" + CourseObj.pars.get(i - 1) + "]: ");
            scoreList.add(myObj.nextInt());
            totalScore += scoreList.get(i - 1);
        }
        myObj.nextLine();
        System.out.print("Enter Description: ");
        description = myObj.nextLine();
        myObj.nextLine();
        // for (int i = 0; i < this.holes; i++) {

        // }
    }

    public void setComment(String Comment) {
        comments.add(Comment);
    }

    public void hardUser(user newUserObj) {
        userObj = newUserObj;

    }

    public void hardCourse(Course newCourseObj) {
        CourseObj = newCourseObj;
    }

    public void hardscore(List<Integer> newScoreList) {
        scoreList = newScoreList;
        for (int i = 0; i < scoreList.size(); i++) {
            totalScore += scoreList.get(i);
        }
    }

    public void hardDescription(String newDesc) {
        description = newDesc;
    }
}
