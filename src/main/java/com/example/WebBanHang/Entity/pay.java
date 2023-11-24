package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class pay {
    @Id
    @GeneratedValue
    @Column
    private long payID;
    @Column
    private String form;

    public pay() {
    }

    public pay(long payID, String form) {
        this.payID = payID;
        this.form = form;
    }

    public long getPayID() {
        return payID;
    }

    public void setPayID(long payID) {
        this.payID = payID;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "pay{" +
                "payID=" + payID +
                ", form='" + form + '\'' +
                '}';
    }
}
