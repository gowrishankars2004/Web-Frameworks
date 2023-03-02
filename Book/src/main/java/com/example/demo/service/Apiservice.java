package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.ApiRepository;

@Service
public class Apiservice {
    @Autowired
    private ApiRepository ser;


    //1.saving details

    public Book SaveBook(Book b){
        return ser.save(b);
    }

    //2.getting details by Id.
    public Book GetBookbyId(int id){
        return ser.findById(id).orElse(null);
    }


    //3.getting all details
    public List<Book> GetBooklist(){
        return ser.findAll();
    }


    //4.updating all details.
    public Book updateBook(int id, Book b){
        b.setId(id);
        return ser.saveAndFlush(b);
    }

    //5.delete all details
     public void DeleteBook(int id){
        ser.deleteById(id);        
     }
    
}
