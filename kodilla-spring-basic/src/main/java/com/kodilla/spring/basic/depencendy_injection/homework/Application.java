package com.kodilla.spring.basic.depencendy_injection.homework;

public class Application {
    public static void main(String[] args) {

        DeliveryService deliveryService = new AddressCheck();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 10);
    }
}
