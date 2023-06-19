package com.example.freeneed.Models;

import jakarta.persistence.*;

@Entity
public class FreeComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String body;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private FreePosts comment;

    public FreeComments() {
    }

    public FreeComments(long id, String body, User user, FreePosts comment) {
        this.id = id;
        this.body = body;
        this.user = user;
        this.comment = comment;
    }

    public FreeComments(String body, User user, FreePosts comment) {
        this.body = body;
        this.user = user;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FreePosts getComment() {
        return comment;
    }

    public void setComment(FreePosts comment) {
        this.comment = comment;
    }
}
