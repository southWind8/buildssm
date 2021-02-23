package com.southWind.dao;

import com.southWind.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName bookMapper
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/22
 **/

public interface BookMapper {
    /**
     * 加
     * @param books
     * @return
     */
    int addBook(Books books);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteBook(int  id);

    /***
     * 改
     * @param books
     * @return
     */
    int updateBook(Books books);

    /**
     * 查
     * @param id
     * @return
     */
    Books queryBookById(int id);

    /**
     * 查所有的书籍
     * @return
     */
    List<Books> queryAllBook();
}
