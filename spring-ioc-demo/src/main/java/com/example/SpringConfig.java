package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Spring纯注解配置类，替代原来的applicationContext.xml
 */
@Configuration  // 标记这是一个Spring配置类
@ComponentScan("com.example")  // 开启组件扫描，指定扫描包
@EnableAspectJAutoProxy  // 开启注解版AOP自动代理
@EnableTransactionManagement  // 【关键】开启声明式事务注解驱动
public class SpringConfig {
    // 1. 配置数据源：数据库连接信息
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/digital_twin?useSSL=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("3522021@Hx");
        return dataSource;
    }

    // 2. 配置JdbcTemplate，用来操作数据库
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    // 3. 配置事务管理器：事务的核心管理者
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}