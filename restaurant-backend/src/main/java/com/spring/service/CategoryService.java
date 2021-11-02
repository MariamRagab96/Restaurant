package com.spring.service;

import com.spring.model.Category;
import com.spring.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class CategoryService {

    @Autowired
     private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
    
     public Category getById(long id) {
        return categoryRepository.getById(id);
    }
}
