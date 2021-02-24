package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class NotificationService {

  Map<Localization, Set<Client>> clientNotifications = new HashMap<>();

  public void addLocalSubscriber(Client client, Localization localization) {
    if (clientNotifications.containsKey(localization)) {
      clientNotifications.get(localization).add(client);
    } else {
      Set<Client> clients = new HashSet<>();
      clients.add(client);
      clientNotifications.put(localization, clients);
    }
  }

  public void sendGeneralNotification(GeneralNotification generalNotification) {
    this.clientNotifications.values()
            .stream()
            .flatMap(s -> s.stream())
            .collect(Collectors.toSet())
            .forEach(c -> c.receive(generalNotification));
  }


  public void sendLocalNotification(LocalNotification localNotification, Localization localization) {
    if (this.clientNotifications.containsKey(localization)) {
      this.clientNotifications.get(localization).forEach(client -> client.receiveLocalNotifications(localNotification));
    }
    else {
      System.out.println("Localization doesn't exist.");
    }
  }

  public void removeLocalSubscriber(Client client, Localization localization) {
    if (clientNotifications.containsKey(localization)) {
      this.clientNotifications.get(localization).remove(client);
    }
    else {
      System.out.println("Localization doesn't exist.");
    }
  }

  public void removeLocalization(Localization localization) {
    this.clientNotifications.remove(localization);
  }
}