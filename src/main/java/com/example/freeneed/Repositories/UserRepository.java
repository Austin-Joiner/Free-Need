package com.example.freeneed.Repositories;

import com.example.freeneed.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long userId);

    User findByUsername(String username);
}
