package com.example.ECommerce_Project.product_dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="ProductDTO")
public class ProductDTO {
    @Id
    private int id;
    private String name;

    private int category_id;
    private double prize ;
    private double weight ;
    private  String description;
//    private String imagename;


    public ProductDTO() {
    }

    public ProductDTO(int id,String name, int category_id, double prize, double weight, String description ) {
        this.id=id;
        this.name = name;
        this.category_id = category_id;
        this.prize = prize;
        this.weight = weight;
        this.description = description;
//        this.imagename=imagename;
    }

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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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
