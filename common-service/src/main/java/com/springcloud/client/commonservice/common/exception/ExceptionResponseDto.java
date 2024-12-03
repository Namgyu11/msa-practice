package com.springcloud.client.commonservice.common.exception;

public record ExceptionResponseDto(
        int status,
        String message
) {
}
