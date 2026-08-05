package com.example;

import com.example.dao.UserDao;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class SpringIocTest {
    public static void main(String[] args) {
        // 加载配置类，创建IOC容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.addUser();

        context.close();
    }
}
