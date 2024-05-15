package org.sc.dto;

import java.util.ArrayList;
import java.util.List;

public record Order(String orderId, List<OrderItem> items) {

    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }

    
}
