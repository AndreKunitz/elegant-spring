package me.andrekunitz.demospring.notification;

import me.andrekunitz.demospring.model.Costumer;

public interface Notificator {
    String notify(Costumer costumer, String message);
}
