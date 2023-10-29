package org.example.order.service.domain.event;

import org.example.event.DomainEvent;
import org.example.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {

  public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
    super(order, createdAt);
  }
}
