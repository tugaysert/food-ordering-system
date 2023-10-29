package org.example.order.service.domain.entity;

import org.example.entity.BaseEntity;
import org.example.valueobject.Money;
import org.example.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {

  private String name;
  private String price;

  public Product(String name, String price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getPrice() {
    return price;
  }
}
