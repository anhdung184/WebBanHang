package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="")
public class userReviews {
    @Id
    @GeneratedValue
    @Column
    private long userReviewID;
    @Column
    private long productID;
    @Column
    private long userID;
    @Column
    private String reviewText;
    @Column
    private long rate;
    @Column
    private Date date ;

    public userReviews() {
    }

    public userReviews(long userReviewID, long productID, long userID, String reviewText, long rate, Date date) {
        this.userReviewID = userReviewID;
        this.productID = productID;
        this.userID = userID;
        this.reviewText = reviewText;
        this.rate = rate;
        this.date = date;
    }

    public long getUserReviewID() {
        return userReviewID;
    }

    public void setUserReviewID(long userReviewID) {
        this.userReviewID = userReviewID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "userReviews{" +
                "userReviewID=" + userReviewID +
                ", productID=" + productID +
                ", userID=" + userID +
                ", reviewText='" + reviewText + '\'' +
                ", rate=" + rate +
                ", date=" + date +
                '}';
    }
}
