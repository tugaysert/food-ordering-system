package org.example.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.example.order.service.domain.entity.OrderItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Getter
public class CreateOrderCommand {
  @NotNull
  private final UUID customerId;
  @NotNull
  private final UUID restaurantId;
  @NotNull
  private final BigDecimal price;
  @NotNull
  private final List<OrderItem> items;
  @NotNull
  private final OrderAddress address;
}
