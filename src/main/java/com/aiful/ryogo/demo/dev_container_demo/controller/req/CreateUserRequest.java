package com.aiful.ryogo.demo.dev_container_demo.controller.req;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserRequest {

    @NotBlank(message = "username CAN NOT BE BLANK")
    private String username;

    @Email(message = "email FORMAT IS INVALID")
    private String email;

    @Size(min = 6, max = 20, message = "LENGTH OF password MUST FROM 6 TO 20")
    private String password;
}
