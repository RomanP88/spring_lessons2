package ru.geekbrains.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {


    private List<Product> products;


    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(new Product(1L, "Milk", 90),
                new Product(2L, "Bread", 40),
                new Product(3L, "Meat", 100),
                new Product(4L, "Ice Cream", 25),
                new Product(5L, "Sausage", 80)
        ));
    }




    public Product findById(Long id){

        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);

    }



    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }




}
