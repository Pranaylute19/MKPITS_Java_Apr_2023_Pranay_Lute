package com.example.ECommerce_Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    private double prize;
    private double weight;
    private String description;
//    private String imagename;

    public Product() {
    }

    public Product(String name, Category category, double prize, double weight, String description) {
        this.name = name;
        this.category = category;
        this.prize = prize;
        this.weight = weight;
        this.description = description;
//        this.imagename=imagename;
    }

//    public String getImagename() {
//        return imagename;
//    }
//
//    public void setImagename(String imagename) {
//        this.imagename = imagename;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
