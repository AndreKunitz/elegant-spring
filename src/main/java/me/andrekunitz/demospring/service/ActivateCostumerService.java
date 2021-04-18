package me.andrekunitz.demospring.service;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.notification.Notificator;
import me.andrekunitz.demospring.notification.NotificatorType;
import org.springframework.stereotype.Service;

import static me.andrekunitz.demospring.notification.UrgencyLevel.*;

@Service
public class ActivateCostumerService {

    private Notificator notificator;

    public ActivateCostumerService(
            @NotificatorType(NON_URGENT) Notificator notificator) {
        this.notificator = notificator;
    }

    public String activate(Costumer costumer) {
        costumer.activate();
        return this.notificator.notify(costumer, "Your registration in the system is active!");
    }
}