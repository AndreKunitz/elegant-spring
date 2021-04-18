package me.andrekunitz.elegantspring.service;

import me.andrekunitz.elegantspring.model.Costumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ActivateCostumerService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void activate(Costumer costumer) {
        costumer.activate();
        eventPublisher.publishEvent(new ActivatedCostumerEvent(costumer));
    }
}