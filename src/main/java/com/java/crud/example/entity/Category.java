package com.java.crud.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;
import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;

    public Object getQuantity() {
        return null;
    }

    public void setQuantity(Object quantity) {
    }

    public Object getPrice() {
        return null;
    }

    public void setPrice(Object price) {
    }
}