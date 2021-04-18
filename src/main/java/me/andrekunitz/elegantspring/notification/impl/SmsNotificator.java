package me.andrekunitz.elegantspring.notification.impl;

import me.andrekunitz.elegantspring.model.Costumer;
import me.andrekunitz.elegantspring.notification.Notificator;
import me.andrekunitz.elegantspring.notification.NotificatorType;
import me.andrekunitz.elegantspring.notification.UrgencyLevel;
import org.springframework.stereotype.Component;

@NotificatorType(UrgencyLevel.URGENT)
@Component
public class SmsNotificator implements Notificator {
    @Override
    public void notify(Costumer costumer, String message) {
        System.out.printf("Notifying %s via SMS %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }
}
