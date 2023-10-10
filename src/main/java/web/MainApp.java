/*
package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.DatabaseConfig;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DatabaseConfig.class);

        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao.getAllUsers());

        context.close();
    }
}
*/