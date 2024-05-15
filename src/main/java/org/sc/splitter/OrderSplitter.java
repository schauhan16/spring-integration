package org.sc.splitter;

import java.util.List;

import org.sc.dto.Order;
import org.sc.dto.OrderItem;

public class OrderSplitter {

    public List<OrderItem> split(Order order) {
        return order.items();
    }

}
