package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="")
public class vouchers {
    @Id
    @GeneratedValue
    @Column
    private long voucherID;
    @Column
    private long quantity;
    @Column
    private Date timeCreate;
    @Column
    private Date expiryDate;
    @Column
    private long deduct;
    @Column
    private long discount;
    @Column
    private long condision;

    public vouchers() {
    }

    public vouchers(long voucherID, long quantity, Date timeCreate, Date expiryDate, long deduct, long discount, long condision) {
        this.voucherID = voucherID;
        this.quantity = quantity;
        this.timeCreate = timeCreate;
        this.expiryDate = expiryDate;
        this.deduct = deduct;
        this.discount = discount;
        this.condision = condision;
    }

    public long getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(long voucherID) {
        this.voucherID = voucherID;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getDeduct() {
        return deduct;
    }

    public void setDeduct(long deduct) {
        this.deduct = deduct;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public long getCondision() {
        return condision;
    }

    public void setCondision(long condision) {
        this.condision = condision;
    }

    @Override
    public String toString() {
        return "vouchers{" +
                "voucherID=" + voucherID +
                ", quantity=" + quantity +
                ", timeCreate=" + timeCreate +
                ", expiryDate=" + expiryDate +
                ", deduct=" + deduct +
                ", discount=" + discount +
                ", condision=" + condision +
                '}';
    }
}
