package com.lendo.ahmed.ali.posts.service;

import com.lendo.ahmed.ali.posts.client.PostFeignClient;
import com.lendo.ahmed.ali.posts.client.UserFeignClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {


    @Mock
    private PostFeignClient postFeignClient;
    @InjectMocks
    private PostService postService;


    @Test
        public void getAllPosts(){
        postService.getAllPosts();
        verify( postFeignClient).getAllPosts();
        }
}
