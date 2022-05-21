package com.lendo.ahmed.ali.posts.service;

import com.lendo.ahmed.ali.posts.client.CommentFeignClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommentServiceTest {


    @Mock
    private CommentFeignClient commentFeignClient;
    @InjectMocks
    private CommentService commentService;


    @Test
    public void getAllComments() {
        commentService.getAllComments();
        verify(commentFeignClient).getAllComments();
    }
}
