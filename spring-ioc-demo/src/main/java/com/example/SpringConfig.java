package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring纯注解配置类，替代原来的applicationContext.xml
 */
@Configuration  // 标记这是一个Spring配置类
@ComponentScan("com.example")  // 开启组件扫描，指定扫描包
public class SpringConfig {
}