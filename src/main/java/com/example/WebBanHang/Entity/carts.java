package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="")
public class carts {
    @Id
    @GeneratedValue
    @Column
    private long cartID;
    @Column
    private long userID;

    @Column
    private  long voucherID;

    @Column
    private Date timeCreate;
    @Column
    private long toltalCost;

    public carts() {
    }

    public carts(long cartID, long userID, long voucherID, Date timeCreate, long toltalCost) {
        this.cartID = cartID;
        this.userID = userID;
        this.voucherID = voucherID;
        this.timeCreate = timeCreate;
        this.toltalCost = toltalCost;
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(long voucherID) {
        this.voucherID = voucherID;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public long getToltalCost() {
        return toltalCost;
    }

    public void setToltalCost(long toltalCost) {
        this.toltalCost = toltalCost;
    }

    @Override
    public String toString() {
        return "carts{" +
                "cartID=" + cartID +
                ", userID=" + userID +
                ", voucherID=" + voucherID +
                ", timeCreate=" + timeCreate +
                ", toltalCost=" + toltalCost +
                '}';
    }
}
