package com.aiful.ryogo.demo.dev_container_demo.controller.res;

import com.aiful.ryogo.demo.dev_container_demo.constant.ApiResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String message;
    private T data;

    public static <T> ApiResponse<T> success(T data) {
        return fromApiResultCode(ApiResultCode.SUCCESS, data);
    }

    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(ApiResultCode.SUCCESS.getCode(), message, data);
    }

    public static ApiResponse<?> error(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }

    public static <T> ApiResponse<T> fromApiResultCode(ApiResultCode apiResultCode) {
        return new ApiResponse<>(apiResultCode.getCode(), apiResultCode.getMessage(), null);
    }

    public static <T> ApiResponse<T> fromApiResultCode(ApiResultCode apiResultCode, T data) {
        return new ApiResponse<>(apiResultCode.getCode(), apiResultCode.getMessage(), data);
    }
}
