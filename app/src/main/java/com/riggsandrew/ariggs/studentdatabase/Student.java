package com.riggsandrew.ariggs.studentdatabase;

/**
 * Created by Andrew Riggs on 9/15/2017.
 */

public class Student {

    private String name;
    private String major;
    private String gradYear;

    public Student(String thisName, String thisMajor, String thisGradYear) {
        this.name = thisName;
        this.major = thisMajor;
        this.gradYear = thisGradYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
}
