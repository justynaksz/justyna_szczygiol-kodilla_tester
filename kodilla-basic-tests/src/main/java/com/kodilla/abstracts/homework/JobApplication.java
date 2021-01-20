package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Postman postman = new Postman();
        Fireman fireman = new Fireman();
        Thief thief = new Thief();

        Person maciek = new Person("Maciej",25, thief);
        maciek.personalResponsibilities();

        Person ola = new Person("Aleksandra", 38, postman);
        ola.personalResponsibilities();

        Person bartek = new Person("Bartosz", 58, fireman);
        bartek.personalResponsibilities();
    }
}
