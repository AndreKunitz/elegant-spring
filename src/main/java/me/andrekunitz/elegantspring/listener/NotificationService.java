package me.andrekunitz.elegantspring.listener;

import me.andrekunitz.elegantspring.notification.Notificator;
import me.andrekunitz.elegantspring.notification.NotificatorType;
import me.andrekunitz.elegantspring.notification.UrgencyLevel;
import me.andrekunitz.elegantspring.service.ActivatedCostumerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    @NotificatorType(UrgencyLevel.NON_URGENT)
    @Autowired
    private Notificator notificator;

    @EventListener
    public void activatedClientListener(ActivatedCostumerEvent event) {
        notificator.notify(event.getCostumer(), "Costumer activated");
    }
}
