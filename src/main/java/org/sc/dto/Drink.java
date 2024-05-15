package org.sc.dto;

import org.sc.constants.DrinkType;

public record Drink(String orderNumber,
        DrinkType type,
        int shots,
        boolean iced) {
}
