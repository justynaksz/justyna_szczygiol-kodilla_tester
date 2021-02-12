package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetAvailableOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Order order13 = new Order("13");
        Order order18 = new Order("18");
        Order order25 = new Order("25");
        Order order7 = new Order("7");
        warehouse.addOrder(order13);
        warehouse.addOrder(order18);
        warehouse.addOrder(order25);
        warehouse.addOrder(order7);

        Order availableOrder = warehouse.getOrder("13");

        assertEquals(order13, availableOrder);
    }

    @Test
    public void testGetUnavailableOrder_withException () {
        Warehouse warehouse = new Warehouse();
        Order order13 = new Order("13");
        Order order18 = new Order("18");
        Order order25 = new Order("25");
        Order order7 = new Order("7");

        warehouse.addOrder(order13);
        warehouse.addOrder(order18);
        warehouse.addOrder(order25);
        warehouse.addOrder(order7);

        OrderDoesntExistException exception = assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("17"));

        assertEquals("The order you are looking for doesn't exist.", exception.getMessage());
        // nie jestem pewna czy o to chodziło :(
    }
}