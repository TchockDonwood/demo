package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post implements Serializable{
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    @Id
    @GeneratedValue
    private Long id;

    public Post() {
    }

    public Post (final Long id, final String text, final Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
    public Long getId() { return id; }

    public void setLikes(Integer likes) { this.likes = likes; }

    public Date getCreationDate() {
        return creationDate;
    }
}
