package com.example.ECommerce_Project.controller;

import com.example.ECommerce_Project.entity.Category;
import com.example.ECommerce_Project.entity.Product;
import com.example.ECommerce_Project.service.admin.CategoryService;
import com.example.ECommerce_Project.service.admin.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class Admincontroller {
    //    public String uploaddir=System.getProperty("user.dir")+"/src/main/resources/static.productimages";
    private CategoryService categoryService;
    private ProductService productService;

    @Autowired
    public Admincontroller(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }
    @GetMapping("/addCategory")
    public String getadd(Model model) {
        Category category = new Category();
        model.addAttribute("cate", category);
        return "Category";
    }

    @PostMapping("/admin/categoryadd")
    public String postCategory(@ModelAttribute("cate") Category category) {
        categoryService.addcategory(category);
        return "redirect:/admin";
    }

    @GetMapping("/admin")
    public String getcat(Model model) {
        List lst = categoryService.showcategory();
        model.addAttribute("category1", lst);
        return "categories";
    }

    @GetMapping("/delete/{id}")
    public String deleterec(@PathVariable int id) {
        categoryService.deleteCategory(id);
        return "redirect:/admin";
    }

    @GetMapping("/update/{id}")
    public String updaterec(@PathVariable int id, Model model) {

        Optional<Category> category = categoryService.updatecategory(id);
        if (category.isPresent()) {
            categoryService.deleteCategory(id);
            model.addAttribute("categry", category);
            return "redirect:/addCategory";
        } else
            return "output";
    }

    //    ------------------------------for product---------------------------
    @GetMapping("/getproduct")
    public String getAllproduct(Model model) {
        model.addAttribute("product", productService.getAllProduct());
        return "Product";
    }

    @GetMapping("/post")
    public String addproduct(Model model) {
        Product product = new Product();
        model.addAttribute("products", product);
        List list = categoryService.showcategory();
        model.addAttribute("getCategory", list);
        return "productsAdd";
    }

    @PostMapping("/productpost")
    public String postdata(@ModelAttribute Product product) {
        productService.addproduct(product);
        return "redirect:/getproduct";
    }
    @GetMapping("/product/delete/{id}")
    public String deleteproduct(@PathVariable int id){
        productService.deletebyid(id);
        return "redirect:/getproduct";
    }

    @GetMapping("/postUpdatedata")
    public String saveproduct(@RequestParam ("id") int id,Model model){
        Product product=productService.updateproduct(id);
        model.addAttribute("products",product);
        return "productsAdd";
    }

}




