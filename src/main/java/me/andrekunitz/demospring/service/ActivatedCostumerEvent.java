package me.andrekunitz.demospring.service;

import lombok.Getter;
import me.andrekunitz.demospring.model.Costumer;

@Getter
public class ActivatedCostumerEvent {

    private Costumer costumer;

    public ActivatedCostumerEvent(Costumer costumer) {
        this.costumer = costumer;
    }
}
