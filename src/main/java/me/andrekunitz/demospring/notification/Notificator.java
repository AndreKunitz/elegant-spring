package me.andrekunitz.demospring.notification;

import me.andrekunitz.demospring.model.Costumer;

public interface Notificator {
    void notify(Costumer costumer, String message);
}
