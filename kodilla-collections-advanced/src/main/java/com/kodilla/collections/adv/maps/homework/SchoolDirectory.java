package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal maciej = new Principal("Maciej", "Kowalski");
        Principal zbigniew = new Principal("Zbigniew", "Miller");
        Principal iwona = new Principal("Iwona", "Wajda");

        School powstancow = new School("Liceum im. Powstancow Slaskich", 28, 32, 46, 52, 20, 18);
        School paderewski = new School("Liceum im. Paderewskiego", 30, 28, 33, 35, 45, 36, 25);
        School stowarzyszenie = new School ("Stowarzyszenie animatorow rozwoju mlodziezy", 18, 22, 15, 10, 25, 35);

        schoolDirectory.put(maciej, powstancow);
        schoolDirectory.put(zbigniew, paderewski);
        schoolDirectory.put(iwona, stowarzyszenie);

        for (Map.Entry<Principal, School> directory : schoolDirectory.entrySet()) {
            System.out.println(directory.getKey().toString() + " of " + directory.getValue().getSchoolName() + " with " + directory.getValue().numOfStudents() + " students.");
            System.out.println("-------------------------------------");
        }
    }
}
