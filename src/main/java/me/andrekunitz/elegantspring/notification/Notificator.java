package me.andrekunitz.elegantspring.notification;

import me.andrekunitz.elegantspring.model.Costumer;

public interface Notificator {
    void notify(Costumer costumer, String message);
}
