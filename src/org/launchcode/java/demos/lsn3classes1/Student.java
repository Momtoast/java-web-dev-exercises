package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public void setNumberOfCredits(int credits) {
        this.numberOfCredits = credits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public double getGpa() {
        return this.gpa;
    }
}