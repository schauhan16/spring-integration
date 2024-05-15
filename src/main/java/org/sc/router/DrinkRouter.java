package org.sc.router;

import org.sc.dto.OrderItem;

public class DrinkRouter {
    public String resolveOrderItemChannel(OrderItem orderItem) {
        return orderItem.iced() ? "coldDrinks" : "hotDrinks";
    }
}
