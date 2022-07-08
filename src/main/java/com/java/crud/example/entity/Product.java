package com.java.crud.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int pid;
    private String productName;
    private int quantity;
    private double price;

    public Integer getId() {
        return null;
    }

    public Object getName() {
        return null;
    }

    public void setName(Object name) {
    }
}
