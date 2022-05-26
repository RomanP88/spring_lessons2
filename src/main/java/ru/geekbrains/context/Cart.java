package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Cart {
    private ProductRepository productRepository;

    List<Product> pro = new ArrayList<>();


    public void showAllInCart(){
        for (Product products : pro) {
            System.out.println(products.toString());
        }

    }


    void addById(Long id){
      pro.add(productRepository.findById(id));
    }

    void deleteById(Long id){
       pro.removeIf((product -> product.getId().equals(id)));

    }





    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
