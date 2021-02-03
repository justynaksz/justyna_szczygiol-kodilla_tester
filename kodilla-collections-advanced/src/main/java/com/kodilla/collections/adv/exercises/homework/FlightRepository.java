package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Tokyo", "Warsaw"));
        flights.add(new Flight("Cracow", "Oslo"));
        flights.add(new Flight("Athens", "Warsaw"));
        flights.add(new Flight("Melbourne", "San Francisco"));
        flights.add(new Flight("Hamburg", "Paris"));
        flights.add(new Flight("Oslo", "Budapest"));
        flights.add(new Flight ("Athens", "Zagreb"));

        return flights;
    }
}
