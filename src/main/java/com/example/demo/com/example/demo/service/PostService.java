package com.example.demo.com.example.demo.service;

import com.example.demo.com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService
{
    public List<Post> listAllPosts()//возвращаю 3 поста из листа постов
    {
        Post post1 = new Post("Сессия прошла!", new Date(124, Calendar.AUGUST, 3));//1900+124 = 2024 год)
        Post post2 = new Post("Не многие уцелели!", new Date(124, Calendar.AUGUST, 4));
        Post post3 = new Post("Но никто не сдаётся!", new Date(124, Calendar.AUGUST, 5));
        List<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
}
