package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class productReviews {
    @Id
    @GeneratedValue
    @Column
    private long productReviewID;

    @Column
    private long productID;

    @Column
    private long rate;
    @Column
    private long numOfRating;

    public productReviews() {
    }

    public productReviews(long productReviewID, long productID, long rate, long numOfRating) {
        this.productReviewID = productReviewID;
        this.productID = productID;
        this.rate = rate;
        this.numOfRating = numOfRating;
    }

    public long getProductReviewID() {
        return productReviewID;
    }

    public void setProductReviewID(long productReviewID) {
        this.productReviewID = productReviewID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public long getNumOfRating() {
        return numOfRating;
    }

    public void setNumOfRating(long numOfRating) {
        this.numOfRating = numOfRating;
    }

    @Override
    public String toString() {
        return "productReviews{" +
                "productReviewID=" + productReviewID +
                ", productID=" + productID +
                ", rate=" + rate +
                ", numOfRating=" + numOfRating +
                '}';
    }
}
