package com.yc.spring;

import static org.junit.Assert.assertTrue;

import com.yc.spring.bean.ClassInfo;
import com.yc.spring.bean.StuInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    @Test
    public void test1() {
        // 初始化IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        ClassInfo cf = (ClassInfo) context.getBean("classInfo");
        System.out.println(cf);

        StuInfo sf = (StuInfo) context.getBean("stuInfo");
        System.out.println(sf);
    }
}
