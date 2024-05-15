package org.sc.services;

import java.util.concurrent.atomic.AtomicInteger;

import org.sc.dto.Drink;
import org.sc.dto.OrderItem;

public class Barista {
    private long hotDrinkDelay = 5000;
    private long coldDrinkDelay = 1000;

    private AtomicInteger hotDrinkCounter = new AtomicInteger();
    private AtomicInteger coldDrinkCounter = new AtomicInteger();

    private void setHotDrinkDelay(int delay) {
        this.hotDrinkDelay = delay;
    }

    private void setColdDrinkDelay(int delay) {
        this.coldDrinkDelay = delay;
    }

    public Drink prepareHotDrink(OrderItem orderItem) {
        try {
            Thread.sleep(hotDrinkDelay);

            System.out.println(Thread.currentThread().getName()
                    + " prepared hot drink #" + hotDrinkCounter.incrementAndGet()
                    + " for order #" + orderItem.orderId()
                    + ": " + orderItem);

            return new Drink(orderItem.orderId(), orderItem.drinkType(), orderItem.shots(), orderItem.iced());
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public Drink prepareColdDrink(OrderItem orderItem) {
        try {
            Thread.sleep(coldDrinkDelay);

            System.out.println(Thread.currentThread().getName()
                    + " prepared cold drink #" + coldDrinkCounter.incrementAndGet()
                    + " for order #" + orderItem.orderId()
                    + ": " + orderItem);

            return new Drink(orderItem.orderId(), orderItem.drinkType(), orderItem.shots(), orderItem.iced());
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
