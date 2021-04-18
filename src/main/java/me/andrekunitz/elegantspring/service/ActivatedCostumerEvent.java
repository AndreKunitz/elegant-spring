package me.andrekunitz.elegantspring.service;

import lombok.Getter;
import me.andrekunitz.elegantspring.model.Costumer;

@Getter
public class ActivatedCostumerEvent {

    private Costumer costumer;

    public ActivatedCostumerEvent(Costumer costumer) {
        this.costumer = costumer;
    }
}
