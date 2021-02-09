package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("get dog food", LocalDate.of(2021, 2, 9), LocalDate.of(2021, 2, 12)));
        tasks.add(new Task("do the washing", LocalDate.of(2021, 2, 8), LocalDate.of(2021, 2, 8)));
        tasks.add(new Task("send the letter", LocalDate.of(2021, 2, 5), LocalDate.of(2021, 2, 7)));
        tasks.add(new Task("call manager", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 16)));
        return tasks;
    }
}
