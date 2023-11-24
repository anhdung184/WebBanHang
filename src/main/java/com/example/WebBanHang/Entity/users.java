package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class users {
    @Id
    @GeneratedValue
    @Column
    private long userID;
    @Column
    private String userName;
    @Column
    private String roleID;
    @Column
    private String password;
    @Column
    private String phoneNumber;
    @Column
    private String mail;
    @Column
    private String name;
    @Column
    private  String sex;
    @Column
    private Date dateOfBirth;

    public users() {
    }

    public users(long userID, String userName, String roleID, String password, String phoneNumber, String mail, String name, String sex, Date dateOfBirth) {
        this.userID = userID;
        this.userName = userName;
        this.roleID = roleID;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", roleID='" + roleID + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
