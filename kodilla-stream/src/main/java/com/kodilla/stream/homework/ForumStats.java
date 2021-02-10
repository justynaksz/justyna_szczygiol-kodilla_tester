package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double oldUsersPostAverage = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.olderThan40())
                // czy jest sposób na przefiltorwanie użytkowników bez tworzenia metod olderThan40() i youngerThan40()?
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average of posts among users over 40.: " + oldUsersPostAverage);

        double youngUsersPostAverage = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.youngerThan40())
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average of posts among users below 40.: " + youngUsersPostAverage);
    }
}
