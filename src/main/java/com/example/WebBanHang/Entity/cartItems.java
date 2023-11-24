package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class cartItems {
    @Id
    @GeneratedValue
    @Column
    private long cartItemID;
    @Column
    private long cartID;
    @Column
    private long productDetailsID;
    @Column
    private int quantity;
    @Column
    private long cost;

    public cartItems(){

    }

    public cartItems(long cartItemID, long cartID, long productDetailsID, int quantity, long cost) {
        this.cartItemID = cartItemID;
        this.cartID = cartID;
        this.productDetailsID = productDetailsID;
        this.quantity = quantity;
        this.cost = cost;
    }

    public long getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(long cartItemID) {
        this.cartItemID = cartItemID;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public long getProductDetailsID() {
        return productDetailsID;
    }

    public void setProductDetailsID(long productDetailsID) {
        this.productDetailsID = productDetailsID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "cartItems{" +
                "cartItemID=" + cartItemID +
                ", cartID=" + cartID +
                ", productDetailsID=" + productDetailsID +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
