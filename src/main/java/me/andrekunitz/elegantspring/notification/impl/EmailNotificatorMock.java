package me.andrekunitz.elegantspring.notification.impl;

import me.andrekunitz.elegantspring.model.Costumer;
import me.andrekunitz.elegantspring.notification.Notificator;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailNotificatorMock implements Notificator {

    private boolean upperCase;

    @Autowired
    private EmailNotificatorProperties properties;

    public void init() {
        System.out.println("INIT: EmailNotificatorMock");
    }

    public void destroy() {
        System.out.println("DESTROY: EmailNotificatorMock");
    }

    @Override
    public void notify(Costumer costumer, String message) {
        if (this.upperCase) {
            message = message.toUpperCase();
        }

        System.out.println("EMAIL SERVER: " + properties.getServerHost() + ":" + properties.getServerPort());

        System.out.printf("MOCK: Notifying %s via EMAIL %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
