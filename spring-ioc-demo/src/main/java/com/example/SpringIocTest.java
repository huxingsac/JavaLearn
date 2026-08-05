package com.example;

import com.example.dao.UserDao;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class SpringIocTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService1 = (UserService) context.getBean("userService");
        UserService userService2 = (UserService) context.getBean("userService");
        if(userService2==userService1){
            System.out.println("建立的两个实例相同，是单例模型");
        }else{
            System.out.println("建立的两个实例不同，不是单例模型");
        }

    }
}
