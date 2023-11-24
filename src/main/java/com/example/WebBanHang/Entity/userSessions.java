package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="")
public class userSessions {
    @Id
    @GeneratedValue
    @Column
    private long seesionID;
    @Column
    private long userID;
    @Column
    private String sessionToken;
    @Column
    private Date expiryDate;

    public userSessions() {
    }

    public userSessions(long seesionID, long userID, String sessionToken, Date expiryDate) {
        this.seesionID = seesionID;
        this.userID = userID;
        this.sessionToken = sessionToken;
        this.expiryDate = expiryDate;
    }

    public long getSeesionID() {
        return seesionID;
    }

    public void setSeesionID(long seesionID) {
        this.seesionID = seesionID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "userSessions{" +
                "seesionID=" + seesionID +
                ", userID=" + userID +
                ", sessionToken='" + sessionToken + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
