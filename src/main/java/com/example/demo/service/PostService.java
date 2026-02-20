package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public Post[] listAllPosts() {
        Post first = new Post("1");
        Post second = new Post("2");
        Post third = new Post("3");

        return new Post[] {first, second, third};
    }
}
