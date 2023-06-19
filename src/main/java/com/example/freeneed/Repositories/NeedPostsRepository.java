package com.example.freeneed.Repositories;

import com.example.freeneed.Models.NeedPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeedPostsRepository extends JpaRepository<NeedPosts, Long> {
    List<NeedPosts> findAll();
}
