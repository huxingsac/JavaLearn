package com.example.dao.impl;

import com.example.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add(){
        System.out.println("新增一条订单记录");
    }
}
