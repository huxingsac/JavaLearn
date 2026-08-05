package com.example.service.impl;

import com.example.dao.OrderDao;
import com.example.service.OrderService;
import org.springframework.core.annotation.Order;

public class OrderServiceImpl implements OrderService{
    private OrderDao orderDao;
    public void setOrderDao(OrderDao orderDao){
        this.orderDao = orderDao;
    }
    @Override
    public void addOrder(){
        orderDao.add();
    }
}
