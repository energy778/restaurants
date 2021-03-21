package ru.veretennikov.restaurants;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-app.xml");

        System.out.println("Bean definition names: " + Arrays.toString(ctx.getBeanDefinitionNames()));

        ctx.close();

    }

}
