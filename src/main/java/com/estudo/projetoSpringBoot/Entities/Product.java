package com.estudo.projetoSpringBoot.Entities;

import com.sun.source.doctree.SeeTree;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String imUrl;

    @Transient
    private Set<Category> categories = new HashSet<>();

    public Product(){
    }
    public Product(Integer id, String name, String description, Double price, String imUrl){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imUrl = imUrl;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getImUrl() {
        return imUrl;
    }
    public void setImUrl(String imUrl) {
        this.imUrl = imUrl;
    }
    public Set<Category> getCategories() {
        return categories;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return id.equals(product.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
