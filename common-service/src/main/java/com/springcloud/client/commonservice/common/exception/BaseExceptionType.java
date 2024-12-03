package com.springcloud.client.commonservice.common.exception;

import org.springframework.http.HttpStatus;

public interface BaseExceptionType {
    String message();
    HttpStatus status();
}
