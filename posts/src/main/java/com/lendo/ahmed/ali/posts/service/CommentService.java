package com.lendo.ahmed.ali.posts.service;

import com.lendo.ahmed.ali.posts.client.CommentFeignClient;
import com.lendo.ahmed.ali.posts.client.PostFeignClient;
import com.lendo.ahmed.ali.posts.dto.CommentDto;
import com.lendo.ahmed.ali.posts.dto.PostDto;
import com.lendo.ahmed.ali.posts.exception_handling.CommentsNotFoundException;
import com.lendo.ahmed.ali.posts.exception_handling.PostsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentFeignClient commentFeignClient;

    public List<CommentDto> getAllComments() {
        try {
            return commentFeignClient.getAllComments();
        } catch (Exception e) {
            throw new CommentsNotFoundException();
        }
    }

 }
