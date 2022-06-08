package ru.geekbrains.oneToManyBackApp;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    private SessionFactoryUtils sessionFactoryUtils;

    public UserDao(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }


    public User findListOfCustomer(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class,id);
            session.getTransaction().commit();
            return product.getUser();
        }
    }

}
