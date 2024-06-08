package com.saket.blog_rest_api.controller;


import com.saket.blog_rest_api.payload.CommentDto;
import com.saket.blog_rest_api.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {


    private CommentService commentService;


    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }


    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(name = "postId") long postId,
                                                    @RequestBody CommentDto commentDto){

        return new ResponseEntity<>(commentService.createComment(postId, commentDto), HttpStatus.CREATED);
    }


}
