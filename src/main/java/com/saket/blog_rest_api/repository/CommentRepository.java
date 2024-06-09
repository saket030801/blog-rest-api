package com.saket.blog_rest_api.repository;

import com.saket.blog_rest_api.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
    Comment findByPostIdAndId(@Param("post_id") long postId, @Param("id") long commentId);
}
