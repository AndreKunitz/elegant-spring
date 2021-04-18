package me.andrekunitz.demospring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Costumer {
    private String name;
    private String email;
    private String phone;
    private boolean active = false;

    public Costumer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void activate() {
        this.active = true;
    }
}

