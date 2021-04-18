package me.andrekunitz.demospring.notification.impl;

import me.andrekunitz.demospring.model.Costumer;
import me.andrekunitz.demospring.notification.Notificator;

public class EmailNotificator implements Notificator {

    private boolean upperCase;
    private String hostSmtpServer;

    public EmailNotificator(String hostSmtpServer) {
        this.hostSmtpServer = hostSmtpServer;
    }

    @Override
    public String notify(Costumer costumer, String message) {
        if (this.upperCase) {
            message = message.toUpperCase();
        }

        return String.format("Notificating %s via EMAIL %s: %s\n",
                costumer.getName(), costumer.getEmail(), message);
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
