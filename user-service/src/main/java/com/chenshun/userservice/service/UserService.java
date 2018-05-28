package com.chenshun.userservice.service;

import com.chenshun.userservice.mapper.UserMapper;
import com.chenshun.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

}
