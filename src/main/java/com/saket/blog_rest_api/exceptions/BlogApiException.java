package com.saket.blog_rest_api.exceptions;

import com.saket.blog_rest_api.payload.CommentDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BlogApiException extends RuntimeException {
    public BlogApiException(HttpStatus httpStatus, String s) {
    }
}
