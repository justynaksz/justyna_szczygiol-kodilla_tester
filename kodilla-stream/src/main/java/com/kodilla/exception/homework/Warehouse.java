package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private List<Order> orders;

    public Warehouse() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> orderOfNumber = getOrders()
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .collect(Collectors.toList());
        if (orderOfNumber.size() != 0) {
            return orderOfNumber.get(0);
        }
        else {
            throw new OrderDoesntExistException("The order you are looking for doesn't exist.");
        }
    }

}
