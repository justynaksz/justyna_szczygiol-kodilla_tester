package com.kodilla.optional.homework;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
