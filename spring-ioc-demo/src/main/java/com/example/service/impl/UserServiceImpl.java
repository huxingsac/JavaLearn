package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void addUser(){
        System.out.println("执行业务层的useradd方法，业务层调用数据层的useradd方法");
        userDao.add();
    }

    @Override
    public void init() {
        System.out.println("userService初始化");
    }

    @Override
    public void destroy() {
        System.out.println("userService销毁了");
    }

}
