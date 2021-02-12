package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("13"));
        warehouse.addOrder(new Order("18"));
        warehouse.addOrder(new Order("25"));
        warehouse.addOrder(new Order("7"));

        try {
            warehouse.getOrder("16");
            System.out.println("There is such an order.");
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
