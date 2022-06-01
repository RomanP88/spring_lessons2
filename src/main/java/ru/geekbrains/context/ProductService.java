package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {


    ProductRepository productRepository;


    public String getTittleById(Long id){
        return productRepository.findById(id).getTittle();
    }



    public String getTittleAll(){
        return productRepository.findAll().toString();
    }





    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}
