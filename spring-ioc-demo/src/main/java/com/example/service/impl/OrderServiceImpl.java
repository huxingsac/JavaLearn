package com.example.service.impl;

import com.example.dao.OrderDao;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderDao orderDao;
    public void setOrderDao(OrderDao orderDao){
        this.orderDao = orderDao;
    }
    @Override
    public void addOrder(){
        orderDao.add();
    }
}
