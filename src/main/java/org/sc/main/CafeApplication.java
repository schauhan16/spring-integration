package org.sc.main;

import java.util.List;
import java.util.UUID;

import org.sc.constants.DrinkType;
import org.sc.dto.Order;
import org.sc.dto.OrderItem;
import org.sc.gateway.Cafe;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CafeApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:cafe-workflow.xml")) {
            final Cafe cafe = context.getBean("cafe", Cafe.class);
            for (int i = 1; i <= 100; i++) {
                final String orderId = UUID.randomUUID().toString();
                Order order = new Order(orderId,
                        List.of(new OrderItem(orderId, DrinkType.LATTE, 2, true),
                                new OrderItem(orderId, DrinkType.MOCHA, 2, false)));

                cafe.placeOrder(order);
            }
        }
    }
}
