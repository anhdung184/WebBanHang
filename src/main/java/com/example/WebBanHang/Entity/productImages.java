package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class productImages {
    @Id
    @GeneratedValue
    @Column
    private long imageID;
    @Column
    private  long productDetailsID;
    @Column
    private String imageURL;

    public productImages() {
    }

    public productImages(long imageID, long productDetailsID, String imageURL) {
        this.imageID = imageID;
        this.productDetailsID = productDetailsID;
        this.imageURL = imageURL;
    }

    public long getImageID() {
        return imageID;
    }

    public void setImageID(long imageID) {
        this.imageID = imageID;
    }

    public long getProductDetailsID() {
        return productDetailsID;
    }

    public void setProductDetailsID(long productDetailsID) {
        this.productDetailsID = productDetailsID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
