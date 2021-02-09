package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> actualTasks = TaskRepository.getTasks()
                .stream()
                .map(d -> d.getDeadline())
                .filter(d -> d.isAfter(LocalDate.now()))
                .collect(Collectors.toList());
                System.out.println(actualTasks);
    }
}
