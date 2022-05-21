package com.lendo.ahmed.ali.posts.client;


import com.lendo.ahmed.ali.posts.dto.PostDto;
import com.lendo.ahmed.ali.posts.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "UserFeignClient", url = "https://gorest.co.in/public/v2/users")
public interface UserFeignClient {
    @GetMapping("")
    List<UserDto> getAllUsers( );


    @GetMapping("/{userId}/posts")
    List<PostDto> getAllUserPosts(@PathVariable long userId);
}
