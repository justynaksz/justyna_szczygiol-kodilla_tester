package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class NotificationService {

  Set<Localization> localizations = new HashSet<>();
  Map<Client, Set<Localization>> clientNotifications = new HashMap<>();

  public void addLocalSubscriber(Client client, Localization localization) {
    localizations.add(localization);
    clientNotifications.put(client, localizations);
  }

  public void sendGeneralNotification(GeneralNotification generalNotification) {
    this.clientNotifications.forEach((client, localizations) -> client.receive(generalNotification));
  }

  public void sendLocalNotification(LocalNotification localNotification, Localization localization) {
    if (localizations.contains(localization)) {
      this.clientNotifications.forEach((client, localizations) -> client.receiveLocalNotifications(localNotification));
    }
  }

  public void removeLocalSubscriber(Client client, Localization localization) {
    this.clientNotifications.get(client).remove(localization);
  }

  public void removeSubscriber(Client client) {
    this.clientNotifications.remove(client);
  }
}