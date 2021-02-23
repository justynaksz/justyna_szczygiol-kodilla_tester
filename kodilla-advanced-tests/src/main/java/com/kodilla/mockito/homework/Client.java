package com.kodilla.mockito.homework;

public interface Client {

    void receive(GeneralNotification generalNotification);

    void receiveLocalNotifications(LocalNotification localNotification);
}
