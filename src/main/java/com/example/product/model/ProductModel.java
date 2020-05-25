package com.example.product.model;

import javax.persistence.*;

@Entity(name = "product")
public class ProductModel {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long productId;

    @Column(name="productName")
    private String productName;

    @Column(name = "client")
    private String client;

    @Column(name="color")
    private String color;

    @Column(name="size")
    private Integer size;

    @Column(name = "sku")
    private Integer sku;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Column(name="seller")
    private String seller;

    public Long getId() {
        return productId;
    }

    public void setId(Long id) {
        this.productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Column(name = "product_quantity")
    private Integer quantity;

    @Column(name="product_price")
    private Integer price;


    @Override
    public String toString() {
        return "ProductModel{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", client='" + client + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", sku=" + sku +
                ", seller='" + seller + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
