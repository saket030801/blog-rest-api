package com.saket.blog_rest_api.service;

import com.saket.blog_rest_api.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long id, CommentDto commentDto);
}
