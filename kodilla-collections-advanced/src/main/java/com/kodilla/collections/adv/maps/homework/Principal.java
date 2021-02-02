package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String firstname;
    private String lastname;

    public Principal(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Principal: " +  firstname + ' ' + lastname;
    }
}
