package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findWithDepartureAirPort() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Athens");

        List<Flight> actualResult = new ArrayList<>();
        actualResult.add(new Flight("Athens", "Warsaw"));
        actualResult.add(new Flight("Athens", "Zagreb"));

        assertEquals(actualResult, result);
    }

    @Test
    public void notFindWithDepartureAirPort() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Zagreb");
        List<Flight> actualResult = new ArrayList<>();
        assertEquals(actualResult, result);
    }

    @Test
    public void findWithArrivalAirPort() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");

        List<Flight> actualResult = new ArrayList<>();
        actualResult.add(new Flight("Tokyo", "Warsaw"));
        actualResult.add(new Flight("Athens", "Warsaw"));

        assertEquals(actualResult, result);
    }

    @Test
    public void notFindWithArrivalAirPort() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Hamburg");
        List<Flight> actualResult = new ArrayList<>();
        assertEquals(actualResult, result);
    }
}