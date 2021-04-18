package me.andrekunitz.demospring.notification.impl;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.notification.Notificator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmailNotificator implements Notificator {

    private boolean upperCase;
    private String hostSmtpServer;

    public EmailNotificator(String hostSmtpServer) {
        this.hostSmtpServer = hostSmtpServer;
    }

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

        System.out.printf("Notifying %s via EMAIL %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
