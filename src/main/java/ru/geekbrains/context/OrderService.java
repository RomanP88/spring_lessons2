package ru.geekbrains.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Provider;

@Component
public class OrderService {

    private ProductService productService;
    private Cart cart;

    private Provider<Cart> provider;



    public void createOrderFromProduct(Long productId){
        System.out.println("Заказ создан: ");
        System.out.println(productService.getTittleById(productId));
    }



    public void createOrderAll(){
        System.out.println("Список продуктов: ");
        System.out.println(productService.getTittleAll());
    }



    public void getCartProvider(){
        System.out.println("Список корзин: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(provider.get());
        }
    }


    public void getAddCart(Long id){
        System.out.println("Список продуктов в корзине: ");
        cart.addById(id);
        System.out.println(cart.pro);

    }







    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }

   @Autowired
   public void setProvider(Provider<Cart> provider) {
        this.provider = provider;
    }

}
