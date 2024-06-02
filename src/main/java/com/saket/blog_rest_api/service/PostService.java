package com.saket.blog_rest_api.service;

import com.saket.blog_rest_api.entity.Post;
import com.saket.blog_rest_api.payload.PostDto;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPosts();
    PostDto getPostById(long id);
    PostDto updatePostById(PostDto postDto, long id);
    void deletePostById(long id);
}
