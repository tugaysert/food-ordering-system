package org.example.order.service.domain.entity;

import org.example.entity.BaseEntity;
import org.example.valueobject.Money;
import org.example.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {

  private String name;
  private Money price;

  public Product(String name, Money price) {
    this.name = name;
    this.price = price;
  }

  public void updateWithConfirmedNameAndPrice(String name, Money price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Money getPrice() {
    return price;
  }
}
