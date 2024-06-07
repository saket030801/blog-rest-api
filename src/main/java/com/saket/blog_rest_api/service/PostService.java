package com.saket.blog_rest_api.service;

import com.saket.blog_rest_api.entity.Post;
import com.saket.blog_rest_api.payload.PostDto;
import com.saket.blog_rest_api.payload.PostResponse;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePostById(PostDto postDto, long id);
    void deletePostById(long id);
}
