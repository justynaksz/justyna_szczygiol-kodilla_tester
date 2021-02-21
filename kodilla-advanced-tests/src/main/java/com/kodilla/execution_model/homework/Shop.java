package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) throws IncorrectOrderData {
        validateOrder(order);
        this.orders.add(order);
    }

    public void validateOrder(Order order) throws IncorrectOrderData {
        if (orders.contains(order)) {
            throw new IncorrectOrderData();
        }
        if (order.getOrderValue() <= 0) {
            throw new IncorrectOrderData();
        }
        if (order.getOrderDate().isAfter(LocalDate.now())) {
            throw new IncorrectOrderData();
        }
    }

    public Set<Order> getOrdersFromTwoYears() {
        Set<Order> ordersInTwoYears = orders
                .stream()
                .filter(o -> o.getOrderDate().isAfter(LocalDate.now().minusYears(2)))
                .collect(Collectors.toSet());
        return ordersInTwoYears;
    }

    public Set<Order> getOrdersBetweenValues(double lowestValue, double biggestValue) {
        Set<Order> ordersBetweenValues = orders
                .stream()
                .filter(o -> (o.getOrderValue() > lowestValue) && (o.getOrderValue() < biggestValue))
                .collect(Collectors.toSet());
        return ordersBetweenValues;
    }

    public Double getSumOfOrdersValues() {
        Double sum = orders
                .stream()
                .mapToDouble(u -> u.getOrderValue())
                .sum();
        return sum;
    }


    public int getSize() {
       return this.orders.size();
    }
}