package com.example.dao;

public interface AccountDao {
    void outMoney(String username,int money);
    void inMoney(String username,int money);
}
