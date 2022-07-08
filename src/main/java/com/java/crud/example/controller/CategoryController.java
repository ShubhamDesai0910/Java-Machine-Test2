package com.java.crud.example.controller;
import com.java.crud.example.entity.Category;
import com.java.crud.example.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService service;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category) {
        return service.saveCategory(category);
    }

    @PostMapping("/addCategorys")
    public List<Category> addCategorys(@RequestBody List<Category> categorys) {
        return service.saveCategorys(categorys);
    }

    @GetMapping("/categorys")
    public List<Category> findAllCategorys() {
        return service.getCategorys();
    }

    @GetMapping("/categoryById/{id}")
    public Category findCategoryById(@PathVariable int id) {
        return service.getCategoryById(id);
    }

    @GetMapping("/Category/{name}")
    public Category findCategoryByName(@PathVariable String name) {
        return service.getCategoryByName(name);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestBody Category category) {
        return service.updateCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id) {
        return service.deleteCategory(id);
    }


}
