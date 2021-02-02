package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Integer> students = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, int... students) {
        this.schoolName = schoolName;
        for (int studentsInClass : students) {
            this.students.add(studentsInClass);
        }
    }

   public int numOfStudents() {
        int sum = 0;
        for (int studentsInClass : students)
            sum += studentsInClass;
        return sum;
   }

    public String getSchoolName() {
        return schoolName;
    }
}
