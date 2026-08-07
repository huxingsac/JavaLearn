package com.example.mapper;

import com.example.pojo.Order;

public interface OrderMapper {
    Order findByIdWithUser(Integer id);
}
