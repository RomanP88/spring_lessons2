package ru.geekbrains.oneToManyBackApp;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name ="title")
    private String title;

    @Column(name="cost")
    private int cost;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product() {
    }

    public Product(String title, User user) {
        this.title = title;
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("Product [id = %d, title = %s, cost = %s]", id, title, cost);
    }
}
