package com.springcloud.client.authservice.auth.application;

public interface TokenExtractor {

    Long extractAccessToken(String token);

    String extractRefreshToken(String token);
}
