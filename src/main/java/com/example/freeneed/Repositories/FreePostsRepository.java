package com.example.freeneed.Repositories;

import com.example.freeneed.Models.FreePosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreePostsRepository extends JpaRepository<FreePosts, Long> {
    List<FreePosts> findAll();
}
