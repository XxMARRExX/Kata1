package model.kata1.software.ulpgc.es;

public class Coach extends Person{

    private int experienceYears;

    public Coach(String name, int experienceYears) {
        super(name);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Coach{" +
                " Name: " + getName() +
                ", experienceYears: " + experienceYears +
                " }";
    }
}
