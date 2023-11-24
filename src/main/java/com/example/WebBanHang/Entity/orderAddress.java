package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class orderAddress {
    @Id
    @GeneratedValue
    @Column
    private long orderAddressID;
    @Column
    private long userID;
    @Column
    private String name;

    @Column
    private String address;

    @Column
    private long phoneNumber;

    @Column
    private String note;

    public orderAddress() {
    }

    public orderAddress(long orderAddressID, long userID, String name, String address, long phoneNumber, String note) {
        this.orderAddressID = orderAddressID;
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.note = note;
    }

    public long getOrderAddressID() {
        return orderAddressID;
    }

    public void setOrderAddressID(long orderAddressID) {
        this.orderAddressID = orderAddressID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "orderAddress{" +
                "orderAddressID=" + orderAddressID +
                ", userID=" + userID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", note='" + note + '\'' +
                '}';
    }
}
