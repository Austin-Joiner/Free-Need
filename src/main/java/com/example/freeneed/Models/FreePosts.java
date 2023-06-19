package com.example.freeneed.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class FreePosts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false)
    private String body;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comment")
    private List<FreeComments> freeComments;

    public FreePosts() {
    }

    public FreePosts(long id, String title, String body, User user, List<FreeComments> freeComments) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.user = user;
        this.freeComments = freeComments;
    }

    public FreePosts(String title, String body, User user, List<FreeComments> freeComments) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.freeComments = freeComments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<FreeComments> getFreeComments() {
        return freeComments;
    }

    public void setFreeComments(List<FreeComments> freeComments) {
        this.freeComments = freeComments;
    }
}
