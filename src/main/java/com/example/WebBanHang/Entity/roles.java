package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class roles {
    @Id
    @GeneratedValue
    @Column
    private long roleID;
    @Column
    private String role;

    public roles() {
    }

    public roles(long roleID, String role) {
        this.roleID = roleID;
        this.role = role;
    }

    public long getRoleID() {
        return roleID;
    }

    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "roles{" +
                "roleID=" + roleID +
                ", role='" + role + '\'' +
                '}';
    }
}
