package com.kodilla.spring.basic.depencendy_injection.homework;

public class AddressCheck implements DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        if (address != null && !address.isEmpty()) {
            System.out.println("Delivering in progress...");
            return true;
        }
        System.out.println("Incorrect address.");
        return false;
    }
}
