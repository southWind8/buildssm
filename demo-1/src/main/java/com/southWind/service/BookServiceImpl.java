package com.southWind.service;

import com.southWind.dao.BookMapper;
import com.southWind.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author :southWind
 * @Date 2021/2/22
 **/
@Service
public class BookServiceImpl implements BookService{
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    private BookMapper bookMapper;

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
