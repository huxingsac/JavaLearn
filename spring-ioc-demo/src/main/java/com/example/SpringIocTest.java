package com.example;

import com.example.dao.UserDao;
import com.example.service.AccountService;
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

        AccountService accountService = context.getBean(AccountService.class);
        try{
            accountService.transfer("张三","李四",100);
        }catch (Exception e){
            System.out.println("转账代码出现错误，看是否有事务回滚！");
        }
        context.close();
    }
}
