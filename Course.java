package oProject;

public class Course {
    public String name;
    public Integer par = 0;
    public Integer[] pars;
    public Integer holes;
    public String location;
    public String tee;
    public Integer record;
    public double index;

    public void setName(String newName) {
        name = newName;
    }

    public void setHoles(Integer setHoles) {
        holes = setHoles;
    }

    public void setPars(Integer[] newPars) {
        pars = newPars;
        for (int i = 0; i < 18; i++) {
            par += pars[i];
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
