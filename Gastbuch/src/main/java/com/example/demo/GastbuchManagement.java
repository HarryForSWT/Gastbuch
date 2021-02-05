package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GastbuchManagement {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments(){
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAll().forEach(comments::add);

        return comments;
    }

    public Comment getById(Long id){
        return commentRepository.findById(id).orElse(null);
    }
    public void add(String author, String title, String text){
        commentRepository.save(new Comment(author, title, text));
    }
}
