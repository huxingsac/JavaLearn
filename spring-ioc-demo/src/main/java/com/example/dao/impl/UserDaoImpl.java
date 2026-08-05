package com.example.dao.impl;
import com.example.dao.UserDao;

import java.sql.SQLOutput;

public class UserDaoImpl implements UserDao{
    private String dbUrl;
    private int maxConnection;

//    public void setDbUrl(String dbUrl) {
//        this.dbUrl = dbUrl;
//    }
    public void setDbUrl(String Url){
        this.dbUrl = Url;
    }
    public void setMaxConnection(int value){
        this.maxConnection = value;
    }
    @Override
    public void add(){
        System.out.println("数据库连接地址为： "+dbUrl);
        System.out.println("最大连接数为： "+maxConnection);
        System.out.println("向数据库中添加一条用户记录");
    }
}
