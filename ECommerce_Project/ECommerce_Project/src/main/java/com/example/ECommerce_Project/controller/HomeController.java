package com.example.ECommerce_Project.controller;

import com.example.ECommerce_Project.service.admin.CategoryService;
import com.example.ECommerce_Project.service.admin.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    private CategoryService categoryService;
    private ProductService productService;
    @Autowired

    public HomeController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }
    @GetMapping("/shop")
    public String home(Model model){

        return "shop";
    }
    @GetMapping("/index")
    public String shop(Model  model){
        model.addAttribute("categories",categoryService.showcategory());
        model.addAttribute("products",productService.getAllProduct());
        return "index";
    }
    @GetMapping("/shop/category/{id}")
    public String shopbyCategory(@PathVariable int id,Model model){
        model.addAttribute("categories",categoryService.showcategory());
        model.addAttribute("products",productService.getallproductcategorybyId(id));
        return "shop";
    }
}
