package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfPackageIsLessThan30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("Adama Mickiewicza 18", 29);
        Assertions.assertTrue(deliverPackage);
    }

    @Test
    public void shouldReturnTrueIfPackageWeightIs30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("Adama Mickiewicza 18", 30);
        Assertions.assertTrue(deliverPackage);
    }

    @Test
    public void shouldReturnFalseIfPackageIsMoreThan30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("Adama Mickiewicza 18", 31);
        Assertions.assertFalse(deliverPackage);
    }

    @Test // powinno zostać doprecyzowane w kodzie
    public void shouldReturnTrueIfPackageIsZeroWeight() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("Adama Mickiewicza 18", 0);
        Assertions.assertTrue(deliverPackage);
    }

    @Test // powinno zostać doprecyzowane w kodzie
    public void shouldReturnFalseIfPackageWeightIsLessThanZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean deliverPackage = bean.deliverPackage("Adama Mickiewicza 18", -1);
        Assertions.assertTrue(deliverPackage);
    }

    @Test
    public void shouldReturnSuccessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Adama Mickiewicza 18");
        Assertions.assertEquals("Package delivered to: Adama Mickiewicza 18", message);
    }

    @Test
    public void shouldReturnFailMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("Adama Mickiewicza 18");
        Assertions.assertEquals("Package not delivered to: Adama Mickiewicza 18", message);
    }

    @Test
    public void shouldReturnSuccessMessageIfPackageIsLessThan30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Adama Mickiewicza 18", 29);
        Assertions.assertEquals("Package delivered to: Adama Mickiewicza 18", message);
    }

    @Test
    public void shouldReturnSuccessMessageIfPackageWeightIs30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Adama Mickiewicza 18", 30);
        Assertions.assertEquals("Package delivered to: Adama Mickiewicza 18", message);
    }

    @Test
    public void shouldReturnFailMessageIfPackageIsMoreThan30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Adama Mickiewicza 18", 31);
        Assertions.assertEquals("Package not delivered to: Adama Mickiewicza 18", message);
    }

    @Test // powinno zostać doprecyzowane w kodzie
    public void shouldReturnFailMessageIfPackageWeightIsZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Adama Mickiewicza 18", 0);
        Assertions.assertEquals("Package delivered to: Adama Mickiewicza 18", message);
    }

    @Test // powinno zostać doprecyzowane w kodzie
    public void shouldReturnFailMessageIfPackageWeightIsLessThanZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Adama Mickiewicza 18", -1);
        Assertions.assertEquals("Package delivered to: Adama Mickiewicza 18", message);
    }







}

