package com.example.WebBanHang.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column()
}
