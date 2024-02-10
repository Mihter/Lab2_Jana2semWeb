package com.example.demo.com.example.demo.service;

import com.example.demo.com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService
{
    public List<Post> listAllPosts()//возвращаю 3 поста из листа постов
    {
        Post post1 = new Post("Сессия прошла!");
        Post post2 = new Post("Не многие уцелели!");
        Post post3 = new Post("Но никто не сдаётся!");
        List<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }

}
