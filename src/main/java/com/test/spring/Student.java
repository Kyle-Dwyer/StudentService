package com.test.spring;

public class Student {
    String studentID;
    String name;
    String department;
    String major;

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getMajor() {
        return major;
    }

    public Student(String studentID, String name, String department, String major) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.major = major;
    }
}
