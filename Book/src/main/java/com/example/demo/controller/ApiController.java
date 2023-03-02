package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.Apiservice;

@RestController
public class ApiController {
    @Autowired

    private Apiservice con;
    

    @PostMapping("/")
    public Book save(@RequestBody Book b){
        System.out.println(b.getBookName());
        return con.SaveBook(b);
    }


    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id){
        return con.GetBookbyId(id);
    }


    @GetMapping("/")
    public List<Book> getBookList(){
        return con.GetBooklist();
    }
    
    
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id,@RequestBody Book b){
        return con.updateBook(id, b);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id){
        con.DeleteBook(id);
    }


}





