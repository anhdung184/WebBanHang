package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class ordStatus {
    @Id
    @GeneratedValue
    @Column
    private long orderStatusID;
    @Column
    private String orderStatus;

    public ordStatus() {
    }

    public ordStatus(long orderStatusID, String orderStatus) {
        this.orderStatusID = orderStatusID;
        this.orderStatus = orderStatus;
    }

    public long getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(long orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "orderStatus{" +
                "orderStatusID=" + orderStatusID +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
