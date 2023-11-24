package com.example.WebBanHang.Entity;

import jakarta.persistence.*;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

@Entity
@Table(name="")
public class products {
    @Id
    @GeneratedValue
    @Column
    private long productID;
    @Column
    private String productGroupID;

    @Column
    private String productName;

    @Column
    private String description;
    @Column
    private  String sizeTable;

    public products() {
    }

    public products(long productID, String productGroupID, String productName, String description, String sizeTable) {
        this.productID = productID;
        this.productGroupID = productGroupID;
        this.productName = productName;
        this.description = description;
        this.sizeTable = sizeTable;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(String productGroupID) {
        this.productGroupID = productGroupID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSizeTable() {
        return sizeTable;
    }

    public void setSizeTable(String sizeTable) {
        this.sizeTable = sizeTable;
    }

    @Override
    public String toString() {
        return "products{" +
                "productID=" + productID +
                ", productGroupID='" + productGroupID + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", sizeTable='" + sizeTable + '\'' +
                '}';
    }
}