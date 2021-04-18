package me.andrekunitz.demospring.listener;

import me.andrekunitz.demospring.notification.Notificator;
import me.andrekunitz.demospring.notification.NotificatorType;
import me.andrekunitz.demospring.notification.UrgencyLevel;
import me.andrekunitz.demospring.service.ActivatedCostumerEvent;
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
