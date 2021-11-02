package com.spring.controller;

import com.spring.model.Category;
import com.spring.service.CategoryService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @RequestMapping("/categories")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @RequestMapping("/categories/{id}")
    public Category getById(@PathVariable long id) {
        return categoryService.getById(id);
    }

}
