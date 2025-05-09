package com.aiful.ryogo.demo.dev_container_demo.exception;

import com.aiful.ryogo.demo.dev_container_demo.constant.ApiResultCode;
import com.aiful.ryogo.demo.dev_container_demo.controller.res.ApiResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiGlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse<?> handleValidationException(MethodArgumentNotValidException ex) {
        ex.printStackTrace();
        String message = ex.getBindingResult().getAllErrors().getFirst().getDefaultMessage();
        return ApiResponse.error(ApiResultCode.BIZ_ERROR.getCode(), message);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResponse<?> handleValidationException(ConstraintViolationException ex) {
        ex.printStackTrace();
        String message = ex.getConstraintViolations().iterator().next().getMessage();
        return ApiResponse.error(ApiResultCode.BIZ_ERROR.getCode(), message);
    }

    @ExceptionHandler(Exception.class)
    public ApiResponse<?> handleGenericException(Exception e) {
        e.printStackTrace();
        return ApiResponse.fromApiResultCode(ApiResultCode.SYS_ERROR);
    }
}

