package ru.geekbrains.oneToManyBackApp;


public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDao(sessionFactoryUtils);
            UserDao userDao = new UserDao(sessionFactoryUtils);

            productDao.findListOfProduct(4L);
            userDao.findListOfCustomer(3L);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
