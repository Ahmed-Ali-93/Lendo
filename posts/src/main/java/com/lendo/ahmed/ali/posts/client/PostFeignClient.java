package com.lendo.ahmed.ali.posts.client;


import com.lendo.ahmed.ali.posts.dto.CommentDto;
import com.lendo.ahmed.ali.posts.dto.PostDto;
import com.lendo.ahmed.ali.posts.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PostFeignClient", url = "https://gorest.co.in/public/v2/posts")
public interface PostFeignClient {
    @GetMapping("")
    List<PostDto> getAllPosts( );


    @GetMapping("/{postId}/comments")
    List<CommentDto> getAllPostComments(@PathVariable long postId);
}
