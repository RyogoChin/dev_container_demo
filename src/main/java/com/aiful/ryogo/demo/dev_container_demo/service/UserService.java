package com.aiful.ryogo.demo.dev_container_demo.service;

import com.aiful.ryogo.demo.dev_container_demo.controller.req.CreateUserRequest;
import com.aiful.ryogo.demo.dev_container_demo.controller.res.UserResult;
import com.aiful.ryogo.demo.dev_container_demo.entity.User;

public interface UserService {

    UserResult getUser(String username);

    UserResult insertOrUpdateUser(CreateUserRequest userReq);

}
