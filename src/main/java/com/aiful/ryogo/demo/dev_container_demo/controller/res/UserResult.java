package com.aiful.ryogo.demo.dev_container_demo.controller.res;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResult {

    private String username;
    private String email;

}
