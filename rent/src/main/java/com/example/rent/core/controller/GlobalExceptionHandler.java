package com.example.rent.core.controller;

import com.example.rent.core.dto.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private ResponseEntity<BaseResponse> createResponseEntity(HttpStatusCode statusCode, String description) {
        BaseResponse error = new BaseResponse();
        error.setStatusCode(statusCode.value());
        error.setStatusCodeDescription(description);
        return new ResponseEntity<>(error, statusCode);
    }
}
