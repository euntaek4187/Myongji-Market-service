package com.example.myeongjimarket.domain.Post.repository;

import com.example.myeongjimarket.domain.Post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}