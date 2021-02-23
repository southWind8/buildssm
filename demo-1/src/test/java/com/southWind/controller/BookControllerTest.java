package com.southWind.controller;

import com.southWind.pojo.Books;
import com.southWind.service.BookService;
import com.southWind.service.BookServiceImpl;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookControllerTest extends TestCase {

    public void testList() {
        ClassPathXmlApplicationContext cx= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = cx.getBean("BookServiceImpl", BookServiceImpl.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}