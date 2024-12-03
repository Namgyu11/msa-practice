package com.springcloud.client.authservice.auth.application;

public interface TokenProvider {
    String generatedAccessToken(Long userId);

    String generatedRefreshToken(String tokenId);
}
