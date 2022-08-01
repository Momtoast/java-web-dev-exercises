package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student studentMel = new Student("Melissa Matos", 1, 1, 4.0);

        System.out.println(studentMel.getName() + "has a GPA of " + studentMel.getGpa());
        System.out.println(studentMel.getGradeLevel());
        studentMel.addGrade(3, 3.0);
        System.out.println(studentMel.getName() + "has a GPA of " + studentMel.getGpa());
    }
}
