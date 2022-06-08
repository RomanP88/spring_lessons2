package ru.geekbrains.oneToManyBackApp;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
@Component
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Product> products;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User() {
    }

    @Override
    public String toString() {
        return String.format("Costumers [id = %d, name = %s, products_count = %d]", id, name, products.size());
    }
}


