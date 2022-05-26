package ru.geekbrains.context;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.context.config.ApplicationConfiguration;

import java.io.IOException;
import java.security.Provider;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        OrderService orderService = context.getBean(OrderService.class);
//        orderService.createOrderFromProduct(2L);
//        orderService.createOrderAll();
//        orderService.getCartProvider();
        ApplicationConsole(scanner, orderService);


    }

    private static void ApplicationConsole(Scanner scanner, OrderService orderService) {
        while (true) {
            System.out.println("Для добавления продуктов в корзину ввидите число от 1 до 5 :");

            String str = scanner.nextLine();

            if (str.equals("/")) {
                orderService.createOrderAll();
            }

            if (str.equals("/end")) {
                System.out.println("Вы вышли из корзины");
                break;
            }

            Long id = scanner.nextLong();
            orderService.getAddCart(id);


            }
    }

}
















