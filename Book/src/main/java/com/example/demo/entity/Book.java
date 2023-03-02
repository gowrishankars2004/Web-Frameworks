package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    @Id
    @Column
    private int id;
    @Column
    private String bookName;
    @Column
    private float amount;
    @Column
    private int  quantity;
    @Column
    private String authorName;
}
