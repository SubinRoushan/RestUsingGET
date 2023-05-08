package com.rest.api.book.requestingrestapi.services;

import com.rest.api.book.requestingrestapi.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookService {

    static public List<Book> list=new ArrayList<>();
    static {
        list.add(new Book(1,"Java","Mr.Subin"));
        list.add(new Book(2,"SQL","Mr.Jay"));
        list.add(new Book(3,"Python","Mr.Raj"));
    }

    //Method for All Book
    public List<Book> getAllBook()
    {
        return list;
    }


    //Method for single Book
    public Book getBookById(int id)
    {
        Book book=new Book();
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
