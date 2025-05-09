package com.aiful.ryogo.demo.dev_container_demo.controller;

import com.aiful.ryogo.demo.dev_container_demo.controller.req.CreateUserRequest;
import com.aiful.ryogo.demo.dev_container_demo.controller.res.ApiResponse;
import com.aiful.ryogo.demo.dev_container_demo.controller.res.UserResult;
import com.aiful.ryogo.demo.dev_container_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public ApiResponse<UserResult> getUser(@RequestParam String username) {
        return ApiResponse.success(userService.getUser(username));
    }

    @PostMapping("/save")
    public ApiResponse<UserResult> saveUser(@RequestBody CreateUserRequest userReq) {
        return ApiResponse.success(userService.insertOrUpdateUser(userReq));
    }

}
