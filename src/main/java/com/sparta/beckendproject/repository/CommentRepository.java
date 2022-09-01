package com.sparta.beckendproject.repository;


import java.util.List;

import com.sparta.beckendproject.domain.Comment;
import com.sparta.beckendproject.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findAllByPost(Post post);
}
