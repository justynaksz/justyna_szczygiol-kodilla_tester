package com.kodilla.optional.homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Janowski", new Teacher("Tomasz Tomaszewski")));
        students.add(new Student("Aneta Anetowska", null));
        students.add(new Student("Iwona Iwnonicka", new Teacher("Franciszek Franciszkowski")));
        students.add(new Student("Małgorzata Małgorzewska", new Teacher("Bartosz Bartoszewski")));
        students.add(new Student("Jakub Jakubowski", null));

        for(Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getTeacherName();
            System.out.println("Uczeń: " + student.getStudentName() + " Nauczyciel: " + teacherName);
        }
    }
}
