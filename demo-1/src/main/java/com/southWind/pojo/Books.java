package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Books
 * @Description TODO
 * @Author :southWind
 * @Date 2021/2/22
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
