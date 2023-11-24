package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class productGroups {
    @Id
    @GeneratedValue
    @Column
    private long productGroupID;
    @Column
    private  String productGroupName;

    public productGroups() {
    }

    public productGroups(long productGroupID, String productGroupName) {
        this.productGroupID = productGroupID;
        this.productGroupName = productGroupName;
    }

    public long getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(long productGroupID) {
        this.productGroupID = productGroupID;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    @Override
    public String toString() {
        return "productGroups{" +
                "productGroupID=" + productGroupID +
                ", productGroupName=" + productGroupName +
                '}';
    }
}
