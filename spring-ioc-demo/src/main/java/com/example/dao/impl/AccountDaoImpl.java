package com.example.dao.impl;

import com.example.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.accessibility.Accessible;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void outMoney(String username,int money){
        String sql = "update account set money = money-? where username = ?";
        jdbcTemplate.update(sql,money,username);
    }
    @Override
    public void inMoney(String username,int money){
        String sql = "update account set money = money+? where username = ?";
        jdbcTemplate.update(sql,money,username);
    }
}
