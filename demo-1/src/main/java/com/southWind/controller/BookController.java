package com.southWind.controller;

import com.southWind.pojo.Books;
import com.southWind.service.BookService;
import lombok.Lombok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author :southWind
 * @Date 2021/2/22
 **/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    //查询全部的书籍并且返回到一个书籍展示页
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=new ArrayList<>();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Model model){
        bookService.addBook(Books.builder().build());
        return "addBook";
    }


}
