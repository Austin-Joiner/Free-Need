package com.example.freeneed.Models;

import jakarta.persistence.*;

@Entity
public class NeedComments {
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
    private NeedPosts comment;

    public NeedComments() {
    }

    public NeedComments(long id, String body, User user, NeedPosts comment) {
        this.id = id;
        this.body = body;
        this.user = user;
        this.comment = comment;
    }

    public NeedComments(String body, User user, NeedPosts comment) {
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

    public NeedPosts getComment() {
        return comment;
    }

    public void setComment(NeedPosts comment) {
        this.comment = comment;
    }
}
