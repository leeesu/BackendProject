package com.sparta.beckendproject.repository;

import com.sparta.beckendproject.domain.Comment;
import com.sparta.beckendproject.domain.ReComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReCommentRepository extends JpaRepository<ReComment, Long> {
    List<ReComment> findAllByComment(Comment comment);
}
