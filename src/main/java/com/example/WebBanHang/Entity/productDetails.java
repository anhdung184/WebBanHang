package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class productDetails {
    @Id
    @GeneratedValue
    @Column
    private long productDetailsID;
    @Column
    private long productID;
    @Column
    private String color;
    @Column
    private long size;
    @Column
    private long quantity;
    @Column
    private long price;

    public productDetails() {
    }

    public productDetails(long productDetailsID, long productID, String color, long size, long quantity, long price) {
        this.productDetailsID = productDetailsID;
        this.productID = productID;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public long getProductDetailsID() {
        return productDetailsID;
    }

    public void setProductDetailsID(long productDetailsID) {
        this.productDetailsID = productDetailsID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "productDetails{" +
                "productDetailsID=" + productDetailsID +
                ", productID=" + productID +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
