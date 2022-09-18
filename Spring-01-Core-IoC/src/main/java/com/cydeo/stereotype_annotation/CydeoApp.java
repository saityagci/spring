package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigCourse.class);
//        Java javaClass=context.getBean(Java.class);
//        javaClass.getTeachingHours();
        context.getBean(Java.class,Agile.class).getTeachingHours();


    }
}
