package com.lendo.ahmed.ali.posts.service;

import com.lendo.ahmed.ali.posts.client.UserFeignClient;
import com.lendo.ahmed.ali.posts.dto.PostDto;
import com.lendo.ahmed.ali.posts.dto.UserDto;
import com.lendo.ahmed.ali.posts.exception_handling.PostsNotFoundException;
import com.lendo.ahmed.ali.posts.exception_handling.UsersNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserFeignClient userFeignClient;

    public List<UserDto> getAllUsers() {
        try {
            return userFeignClient.getAllUsers();
          }catch (Exception e){
        throw  new UsersNotFoundException();
    }

    }

    public List<PostDto> getAllUserPosts(long userId) {
        try {
            return userFeignClient.getAllUserPosts(userId);
        } catch (Exception e) {
            throw new PostsNotFoundException();
        }
    }
}
