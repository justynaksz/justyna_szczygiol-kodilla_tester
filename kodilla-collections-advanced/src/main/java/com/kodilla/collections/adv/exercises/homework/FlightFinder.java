package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public FlightFinder() {
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                foundFlights.add(flight);
            }
        }
        if (foundFlights.size() == 0) {
            System.out.println("Sorry, we could not find your flight.");
        }
        return foundFlights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                foundFlights.add(flight);
            }
        }
        if (foundFlights.size() == 0) {
            System.out.println("Sorry, we could not find your flight.");
        }
        return foundFlights;
    }
}
