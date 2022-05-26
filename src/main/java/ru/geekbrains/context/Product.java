package ru.geekbrains.context;



public class Product {

    private Long id;
    private String tittle;
    private int price;

    public Product(Long id, String tittle, int price) {
        this.id = id;
        this.tittle = tittle;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Продукт № %d - %s стоит %d рублей \n", id, tittle, price);

    }
}
