package com.java.crud.example.service;
import com.java.crud.example.entity.Category;

import com.java.crud.example.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public Category saveProduct(Category category) {
        return repository.save(category);
    }

    public List<Category> saveCategorys(List<Category> categorys) {
        return repository.saveAll(categorys);
    }

    public List<Category> getCategorys() {
        return repository.findAll();
    }

    public Category getCategorytById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Category getCategoryByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCategory(int id) {
        repository.deleteById(id);
        return "category removed !! " + id;
    }

    public Category updateCategory(Category category) {
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        assert existingCategory != null;
        existingCategory.setName(category.getName());
        existingCategory.setQuantity(category.getQuantity());
        existingCategory.setPrice(category.getPrice());
        return repository.save(existingCategory);
    }

    public Category getCategoryById(int id) {
        return null;
    }

    public Category saveCategory(Category category) {
        return category;
    }
}
