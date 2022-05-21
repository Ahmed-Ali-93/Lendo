package com.lendo.ahmed.ali.posts.service;

import com.lendo.ahmed.ali.posts.client.UserFeignClient;
import com.lendo.ahmed.ali.posts.dto.UserDto;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {


    @Mock
    private UserFeignClient userFeignClient;
    @InjectMocks
    private UserService userService;


    @Test
        public void getAllUsers(){
        userService.getAllUsers();
        verify(userFeignClient).getAllUsers();
        }
}
