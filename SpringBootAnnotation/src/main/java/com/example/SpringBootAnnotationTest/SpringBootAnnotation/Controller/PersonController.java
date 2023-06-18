package com.example.SpringBootAnnotationTest.SpringBootAnnotation.Controller;

import com.example.SpringBootAnnotationTest.SpringBootAnnotation.MailHandler;
import com.example.SpringBootAnnotationTest.SpringBootAnnotation.MyObjects.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    @Qualifier("Shubham")
    Person A;

    @Autowired
    MailHandler h1;
    @GetMapping("name")
    public String getPersonName()
    {
        System.out.println("The application is supposed to send mails");
        h1.sendMail();
        System.out.println("Mail send successfully ");
        return A.getName();
    }
}
