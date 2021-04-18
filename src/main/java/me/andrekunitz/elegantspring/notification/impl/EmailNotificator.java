package me.andrekunitz.elegantspring.notification.impl;

import me.andrekunitz.elegantspring.model.Costumer;
import me.andrekunitz.elegantspring.notification.Notificator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmailNotificator implements Notificator {

    private boolean upperCase;

    @Autowired
    private EmailNotificatorProperties properties;

    @PostConstruct
    public void init() {
        System.out.println("INIT: EmailNotificator");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY: EmailNotificator");
    }

    @Override
    public void notify(Costumer costumer, String message) {
        if (this.upperCase) {
            message = message.toUpperCase();
        }

        System.out.println("EMAIL SERVER: " + properties.getServerHost() + ":" + properties.getServerPort());

        System.out.printf("Notifying %s via EMAIL %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
