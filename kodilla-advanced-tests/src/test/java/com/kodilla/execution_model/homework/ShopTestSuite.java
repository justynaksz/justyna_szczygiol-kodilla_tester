package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(10.99, LocalDate.parse("2020-02-10"), "ania");
    Order order2 = new Order(12.99, LocalDate.parse("2018-09-20"), "feliks");
    Order order3 = new Order(15.99, LocalDate.parse("2019-03-15"), "bartek");
    Order order4 = new Order(35.99, LocalDate.parse("2015-12-26"), "kasia");
    Order order5 = new Order(110.00, LocalDate.parse("2021-01-18"), "ola");
    Order order6 = new Order(9.99, LocalDate.parse("2017-10-12"), "tomek");
    Order order7 = new Order(1.00, LocalDate.parse("2020-09-17"), "kuba");

    @Test
    public void shouldAddNoOrders() {
        assertEquals(0, shop.getSize());
    }

    @Test
    public void shouldAddOrders() throws IncorrectOrderData {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        assertEquals(7, shop.getSize());
    }

    @Test
    public void shouldNotAddIdenticalOrders() throws IncorrectOrderData {
        shop.addOrder(order1);
        Order order = new Order(10.99, LocalDate.parse("2020-02-10"), "ania");
        IncorrectOrderData exception = assertThrows(IncorrectOrderData.class, () -> shop.addOrder(order));
        assertEquals("Incorrect order data.", exception.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectOrderData.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionBecauseOfIncorrectData(ArgumentsAccessor argument) {
        double orderValue = argument.getDouble(0);
        LocalDate orderDate = LocalDate.parse(argument.getString(1));
        String login = argument.getString(2);
        Order incorrectOrder = new Order(orderValue, orderDate, login);
        IncorrectOrderData exception = assertThrows(IncorrectOrderData.class, () -> shop.addOrder(incorrectOrder));
        assertEquals("Incorrect order data.", exception.getMessage());
    }

    @Test
    public void shouldReturnOrdersFromTwoYears() throws IncorrectOrderData {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        assertEquals(4, shop.getOrdersFromTwoYears().size());
    }

    @Test
    public void shouldReturnZeroOrdersFromTwoYears() throws IncorrectOrderData {
        shop.addOrder(order2);
        shop.addOrder(order4);
        shop.addOrder(order6);
        assertEquals(0, shop.getOrdersFromTwoYears().size());
    }

    @ParameterizedTest
    @CsvSource(value = {"10,20,3", "20,150,2", "2,50,5"})
    public void shouldReturnOrdersBetweenInputRange(double rangeNum1, double rangeNum2, int expected) throws IncorrectOrderData {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        assertEquals(expected, shop.getOrdersBetweenValues(rangeNum1, rangeNum2).size());
    }

    @Test
    public void shouldNotReturnOrdersBetweenInputRange() {
        assertEquals(0, shop.getOrdersBetweenValues(10, 150).size());
    }

    @Test
    public void shouldReturnZeroSumOfOrdersValue() {
        assertEquals(0, shop.getSumOfOrdersValues());
    }

    @Test
    public void shouldReturnSumOfOrdersValue() throws IncorrectOrderData {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        assertEquals(196.95, shop.getSumOfOrdersValues());
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing.");
    }

    @AfterAll
    public static void displayGoodbyeMessage() {
        System.out.println("Finishing testing.");
    }
}