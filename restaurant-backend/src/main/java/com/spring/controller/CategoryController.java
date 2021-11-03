package com.spring.controller;

import com.spring.model.Category;
import com.spring.service.CategoryService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/")
    public String myForm() {
        return "myForm";
    }

    @RequestMapping("/proccesMyForm")
    public String home(HttpServletRequest httpServletRequest, Model model) {
        String id = httpServletRequest.getParameter("id");
        Category category = categoryService.getById(Long.parseLong(id));
       
        model.addAttribute("category", category.getName());
        return "home";
    }
    
}
