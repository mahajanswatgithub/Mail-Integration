package com.example.SpringBootAnnotationTest.SpringBootAnnotation;

import com.example.SpringBootAnnotationTest.SpringBootAnnotation.MyObjects.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAnnotationConfiguration {

    @Bean("Shubham")
    public Person getPersonObject1()
    {
        System.out.println("Inside bean method getPersonObject1" );
        return new Person("Shubham");
    }
    @Bean("Nikita")
    public Person getPersonObject2()
    {
        System.out.println("Inside bean method getPersonObject2" );
        return new Person("Nikita");
    }
}
