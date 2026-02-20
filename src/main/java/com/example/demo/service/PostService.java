package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList(
            new Post("Первое правило Бойцовского клуба – не упоминать о Бойцовском клубе.", new Date()),
            new Post("Второе правило Бойцовского клуба – не упоминать нигде о Бойцовском клубе.", new Date()),
            new Post("Третье правило Бойцовского клуба – боец крикнул «стоп», выдохся, отключился — бой окончен.", new Date())
    ));

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
    public ArrayList<Post> listAllPosts() {
        return posts;
    }
}
