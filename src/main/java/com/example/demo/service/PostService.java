package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    public Post[] listAllPosts() {
        Post first = new Post("Первое правило Бойцовского клуба – не упоминать о Бойцовском клубе.", new Date());
        Post second = new Post("Второе правило Бойцовского клуба – не упоминать нигде о Бойцовском клубе.", new Date());
        Post third = new Post("Третье правило Бойцовского клуба – боец крикнул «стоп», выдохся, отключился — бой окончен.", new Date());

        return new Post[] {first, second, third};
    }
}
