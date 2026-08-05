package com.example.dao.impl;
import com.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
@Repository
public class UserDaoImpl implements UserDao{
    @Value("www.baidu.com")
    private String dbUrl;
    @Value("100")
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
