package com.aiful.ryogo.demo.dev_container_demo.service.impl;

import com.aiful.ryogo.demo.dev_container_demo.controller.req.CreateUserRequest;
import com.aiful.ryogo.demo.dev_container_demo.controller.res.UserResult;
import com.aiful.ryogo.demo.dev_container_demo.entity.User;
import com.aiful.ryogo.demo.dev_container_demo.repository.UserRepository;
import com.aiful.ryogo.demo.dev_container_demo.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResult getUser(String username) {
        return userRepository.findByUsername(username)
                .map(user -> UserResult.builder()
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .build())
                .orElse(null);
    }

    @Transactional
    @Override
    public UserResult insertOrUpdateUser(CreateUserRequest userReq) {
        User user = userRepository.findByUsername(userReq.getUsername())
                .map(existingUser -> {
                    existingUser.setEmail(userReq.getEmail());
                    existingUser.setPassword(userReq.getPassword());
                    return existingUser;
                })
                .orElseGet(() -> User.builder()
                        .username(userReq.getUsername())
                        .email(userReq.getEmail())
                        .password(userReq.getPassword())
                        .build());

        userRepository.save(user);

        return UserResult.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }

}
