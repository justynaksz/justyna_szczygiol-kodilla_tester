package com.kodilla.mockito.homework;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Localization localization = Mockito.mock(Localization.class);
    Localization localization1 = Mockito.mock(Localization.class);
    Localization localization2 = Mockito.mock(Localization.class);
    Localization localization4 = Mockito.mock(Localization.class);
    GeneralNotification generalnotification = Mockito.mock(GeneralNotification.class);
    LocalNotification localNotification = Mockito.mock(LocalNotification.class);
    NotificationService notificationService = new NotificationService();

    @Test
    public void subscribedClientShouldReceiveLocalNotification() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.sendLocalNotification(localNotification, localization);
        Mockito.verify(client, Mockito.times(1)).receiveLocalNotifications(localNotification);
    }

    @Test
    public void clientCanUnsubscribeLocalNotification() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client, localization1);
        notificationService.addLocalSubscriber(client, localization2);
        notificationService.removeLocalSubscriber(client, localization);
        notificationService.sendLocalNotification(localNotification, localization);
        notificationService.sendLocalNotification(localNotification, localization1);
        notificationService.sendLocalNotification(localNotification, localization2);
        Mockito.verify(client, Mockito.times(2)).receiveLocalNotifications(localNotification);
    }

    @Test
    public void clientCanUnsubscribeAllLocalNotification() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client, localization1);
        notificationService.addLocalSubscriber(client, localization2);
        notificationService.removeLocalSubscriber(client, localization);
        notificationService.removeLocalSubscriber(client, localization1);
        notificationService.removeLocalSubscriber(client, localization2);
        notificationService.sendLocalNotification(localNotification, localization);
        notificationService.sendLocalNotification(localNotification, localization1);
        notificationService.sendLocalNotification(localNotification, localization2);
        Mockito.verify(client, Mockito.times(0)).receiveLocalNotifications(localNotification);
    }

    @Test
    public void allSubscribedClientShouldReceiveGeneralNotification() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client, localization1);
        notificationService.addLocalSubscriber(client, localization2);
        notificationService.sendGeneralNotification(generalnotification);
        Mockito.verify(client, Mockito.times(1)).receive(generalnotification);
    }

    @Test
    public void localNotificationShouldBeReceivedByLocalSubscribedClients() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client1, localization1);
        notificationService.addLocalSubscriber(client2, localization2);
        notificationService.sendLocalNotification(localNotification, localization2);
        Mockito.verify(client, Mockito.never()).receiveLocalNotifications(localNotification);
        Mockito.verify(client1, Mockito.never()).receiveLocalNotifications(localNotification);
        Mockito.verify(client2, Mockito.times(1)).receiveLocalNotifications(localNotification);
    }

    @Test
    public void sendNotificationToNotExistingLocalization() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client1, localization1);
        notificationService.addLocalSubscriber(client2, localization2);
        notificationService.sendLocalNotification(localNotification, localization4);
        Mockito.verify(client, Mockito.never()).receiveLocalNotifications(localNotification);
        Mockito.verify(client1, Mockito.never()).receiveLocalNotifications(localNotification);
        Mockito.verify(client2, Mockito.never()).receiveLocalNotifications(localNotification);
    }

    @Test
    public void shouldRemoveLocalization() {
        notificationService.addLocalSubscriber(client, localization);
        notificationService.addLocalSubscriber(client1, localization1);
        notificationService.removeLocalization(localization);
        notificationService.sendLocalNotification(localNotification, localization);
        notificationService.sendLocalNotification(localNotification, localization1);
        Mockito.verify(client, Mockito.never()).receiveLocalNotifications(localNotification);
        Mockito.verify(client1, Mockito.times(1)).receiveLocalNotifications(localNotification);
    }
}
