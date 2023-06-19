package com.example.freeneed.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String username;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false)
    private String password;
    @Column()
    private String profilePic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<FreePosts> freePost;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<NeedPosts> needPost;

    public User() {
    }

    public User(int id, String username, String firstName, String lastName, String password, String profilePic, List<FreePosts> freePost, List<NeedPosts> needPost) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.profilePic = profilePic;
        this.freePost = freePost;
        this.needPost = needPost;
    }

    public User(String username, String firstName, String lastName, String password, String profilePic, List<FreePosts> freePost, List<NeedPosts> needPost) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.profilePic = profilePic;
        this.freePost = freePost;
        this.needPost = needPost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public List<FreePosts> getFreePost() {
        return freePost;
    }

    public void setFreePost(List<FreePosts> freePost) {
        this.freePost = freePost;
    }

    public List<NeedPosts> getNeedPost() {
        return needPost;
    }

    public void setNeedPost(List<NeedPosts> needPost) {
        this.needPost = needPost;
    }
}
