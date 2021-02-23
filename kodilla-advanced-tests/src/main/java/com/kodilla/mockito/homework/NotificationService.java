package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class NotificationService {

  Map<Localization, Client> clientNotifications = new HashMap<>();

  public void addLocalSubscriber(Client client, Localization localization) {
    clientNotifications.put(localization, client);
  }

  public void sendGeneralNotification(GeneralNotification generalNotification) {
    this.clientNotifications.values()
            .stream()
            .forEach(client -> client.receive(generalNotification));
  }

  public void sendLocalNotification(LocalNotification localNotification, Localization localization) {
    this.clientNotifications.get(localization).receiveLocalNotifications(localNotification);
  }

  public void removeLocalSubscriber(Client client, Localization localization) {
    this.clientNotifications.remove(localization, client);
  }

  public void removeLocalization(Localization localization) {
    this.clientNotifications.remove(localization);
  }
}