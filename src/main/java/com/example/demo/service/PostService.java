package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService
{
    /*List<Post> posts;

    {
        posts = new ArrayList<>();
        Post post1 = new Post((long)posts.size(),"Сессия прошла!", new Date(124, Calendar.AUGUST, 3));//1900+124 = 2024 год)
        Post post2 = new Post((long)posts.size(),"Не многие уцелели!", new Date(124, Calendar.AUGUST, 4));
        Post post3 = new Post((long)posts.size(),"Но никто не сдаётся!", new Date(124, Calendar.AUGUST, 5));
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
    }*/

    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts()
    {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(String text) //для создания нового поста
    {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
