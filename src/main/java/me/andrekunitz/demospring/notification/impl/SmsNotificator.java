package me.andrekunitz.demospring.notification.impl;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.notification.Notificator;
import me.andrekunitz.demospring.notification.NotificatorType;
import me.andrekunitz.demospring.notification.UrgencyLevel;
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
