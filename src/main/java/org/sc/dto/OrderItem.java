package org.sc.dto;

import org.sc.constants.DrinkType;

public record OrderItem(String orderId, DrinkType drinkType, int shots, boolean iced) {    
}
