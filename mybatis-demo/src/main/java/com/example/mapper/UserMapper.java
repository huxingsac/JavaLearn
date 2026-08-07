package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.*;

public interface UserMapper {
    List<User> findAll();
    User findById(Integer id);
    Integer deleteById(Integer id);
    Integer addUser(@Param("username") String username, @Param("password")String password, @Param("age")Integer age, @Param("email")String email);
    Integer addUser(User user);
    List<User> findByMap(HashMap<String, Object> params);
    Integer updateUser(HashMap<String,Object>params);
    Integer deleteByDiList(@Param("idList") ArrayList<Integer>idList);
    Integer addUserList(@Param("userList") ArrayList<User>userList);
    User findByIdWithOrders(Integer id);
}
