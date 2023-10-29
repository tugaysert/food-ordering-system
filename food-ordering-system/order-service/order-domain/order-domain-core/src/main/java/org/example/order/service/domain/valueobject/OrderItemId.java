package org.example.order.service.domain.valueobject;

import org.example.valueobject.BaseId;

/**
 * The uniqueness of order item is only important in the aggregates.
 */
public class OrderItemId extends BaseId<Long> {
  public OrderItemId(Long value) {
    super(value);
  }
}
