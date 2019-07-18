package com.work.config;


import com.work.dto.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.work")
@EnableAspectJAutoProxy
public class AopConfig {

    /*@Bean
    public  User user(){
        System.out.println("=========================实例化User");
        User user = new User();
        user.setId("123");
        user.setName("秦始王");
        return user;
    }
   public void VIce(){
       InternalResourceViewResolver a = new InternalResourceViewResolver();
       a.setPrefix();
       a.setViewClass();
   }*/

}
