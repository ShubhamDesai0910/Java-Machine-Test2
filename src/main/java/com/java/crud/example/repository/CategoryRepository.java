package com.java.crud.example.repository;
import com.java.crud.example.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category,Integer>{
    Category findByName(String name);
}
