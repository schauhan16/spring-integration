package org.sc.gateway;

import org.sc.dto.Order;
import org.springframework.integration.annotation.Gateway;

public interface Cafe {
    @Gateway(requestChannel = "orders")
    void placeOrder(Order order);
}
