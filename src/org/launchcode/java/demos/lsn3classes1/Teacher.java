package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    public String firstName;
    public String lastName;
    public String subject;
    private int yearsTeaching;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }
}
