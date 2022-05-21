package com.lendo.ahmed.ali.posts.controller;

import com.lendo.ahmed.ali.posts.dto.CommentDto;
import com.lendo.ahmed.ali.posts.dto.PostDto;
import com.lendo.ahmed.ali.posts.dto.UserDto;
import com.lendo.ahmed.ali.posts.service.CommentService;
import com.lendo.ahmed.ali.posts.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping("/comments")
@Slf4j
public class CommentController {

    @Autowired
    CommentService  commentService;

    @GetMapping("")
    public List<CommentDto> getAllComments() {
        return commentService.getAllComments();
    }



}
