package me.andrekunitz.demospring.notification.impl;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.notification.Notificator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmailNotificatorMock implements Notificator {

    private boolean upperCase;
    private String hostSmtpServer;

    public EmailNotificatorMock(String hostSmtpServer) {
        this.hostSmtpServer = hostSmtpServer;
    }

    public void init() {
        System.out.println("INIT: EmailNotificatorMock");
    }

    public void destroy() {
        System.out.println("DESTROY: EmailNotificatorMock");
    }

    @Override
    public String notify(Costumer costumer, String message) {
        if (this.upperCase) {
            message = message.toUpperCase();
        }

        return String.format("MOCK: Notifying %s via EMAIL %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
