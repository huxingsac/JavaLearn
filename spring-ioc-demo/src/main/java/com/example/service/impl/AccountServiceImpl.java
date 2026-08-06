package com.example.service.impl;

import com.example.dao.AccountDao;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    @Transactional
    public void transfer(String outUsername,String inUserName,int money){
        accountDao.outMoney(outUsername,money);
        try{
            Integer i = 1/0;
        }catch (Exception e){
            System.out.println("事务中出现错误");
        }

        accountDao.inMoney(inUserName,money);
    }
}
