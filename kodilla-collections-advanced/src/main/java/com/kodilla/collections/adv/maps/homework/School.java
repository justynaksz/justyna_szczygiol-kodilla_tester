package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students) && Objects.equals(schoolName, school.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, schoolName);
    }
}
