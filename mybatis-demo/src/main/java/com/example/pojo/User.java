package com.example.pojo;

import javax.lang.model.element.NestingKind;
import java.util.List;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String email;
    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    // 无参构造（MyBatis反射需要，必须有）
    public User() {}

    public User(Integer id, String username, String password, Integer age, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    // getter 和 setter 方法
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // 方便打印看结果
    @Override
    public String toString() {
        return "User{id=" + id + ", username='" + username + '\'' +
                ", age=" + age + ", email='" + email + '\'' + '}';
    }
}
