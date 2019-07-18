package com.work;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.work.Aop.AopJ;
import com.work.config.AopConfig;
import com.work.dto.People;
import com.work.dto.User;
import com.work.service.UserService;
import com.work.service.impl.UserServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        /**java*/
        /*AnnotationConfigApplicationContext annotation =  new AnnotationConfigApplicationContext(AopConfig.class);
        UserServiceImpl userService = (UserServiceImpl)annotation.getBean("userServiceImpl");
        User user = (User)annotation.getBean("user");
        System.out.println(user.getName()+"|"+user.getId());
        System.out.println(userService);
        People people = (People)annotation.getBean("people");
        people.getName();*/
        /**XML*/
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)applicationContext.getBean("userServiceImpl");
        People people = (People)applicationContext.getBean("people");
        People peoplec = (People)applicationContext.getBean("peoplec");
        User users = (User)applicationContext.getBean("getUsers");
        User user = (User)applicationContext.getBean("getUser");
        userServiceImpl.ren();
        System.out.println(people.getName());
        System.out.println(user);
        System.out.println(users);
        System.out.println(peoplec.getName());*/
        /***
         * AOP
         *
         */
        AnnotationConfigApplicationContext annotation =  new AnnotationConfigApplicationContext(AopConfig.class);
        People people = (People)annotation.getBean("people");
        UserService userServiceImpl = (UserService)annotation.getBean("userServiceImpl");
        System.out.println(people.getName());
        userServiceImpl.testAop();

    }
    @org.junit.jupiter.api.Test
    public  void sys(){
        People P = new People();

    }
}
