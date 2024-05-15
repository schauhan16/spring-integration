package org.sc.services;

import java.util.List;

import org.sc.dto.Delivery;
import org.sc.dto.Drink;

public class Waiter {
    public Delivery prepareDelivery(List<Drink> drinks) {
        return new Delivery(drinks);
    }
}
