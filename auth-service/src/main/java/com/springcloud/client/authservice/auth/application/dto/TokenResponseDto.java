package com.springcloud.client.authservice.auth.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record TokenResponseDto(
        String accessToken,
        @JsonIgnore String refreshToken
) {

    public static TokenResponseDto of(String accessToken, String refreshToken) {
        return new TokenResponseDto(accessToken, refreshToken);
    }
}
