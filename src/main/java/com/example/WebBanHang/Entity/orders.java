package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class orders {
    @Id
    @GeneratedValue
    @Column
    private long orderID;

    @Column
    private long addressID;

    @Column
    private long payID;

    @Column
    private long cartID;

    @Column
    private long orderStatusID;

    public orders() {
    }

    public orders(long orderID, long addressID, long payID, long cartID, long orderStatusID) {
        this.orderID = orderID;
        this.addressID = addressID;
        this.payID = payID;
        this.cartID = cartID;
        this.orderStatusID = orderStatusID;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(long addressID) {
        this.addressID = addressID;
    }

    public long getPayID() {
        return payID;
    }

    public void setPayID(long payID) {
        this.payID = payID;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public long getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(long orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    @Override
    public String toString() {
        return "orders{" +
                "orderID=" + orderID +
                ", addressID=" + addressID +
                ", payID=" + payID +
                ", cartID=" + cartID +
                ", orderStatusID=" + orderStatusID +
                '}';
    }
}
