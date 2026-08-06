package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    /**
     * 前置通知：目标方法执行之前，先执行这段代码
     * execution 是切入点表达式，用来指定要增强哪些方法
     * 语法：execution(返回值 包名.类名.方法名(参数))
     * 下面这句的意思：匹配com.example.service.impl包下所有类的所有方法
     */
    @Before("execution(* com.example.service.impl.*.*(..))")
    public void printLogBefore(){
        System.out.println("前置日志方法开始执行");
    }
}
