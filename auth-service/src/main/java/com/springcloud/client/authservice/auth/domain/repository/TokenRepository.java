package com.springcloud.client.authservice.auth.domain.repository;

import com.springcloud.client.authservice.auth.domain.Token;
import java.util.Optional;

public interface TokenRepository {
    void save (Token token);
    void deleteByTokenId(String tokenId);
    Optional<Token> findByTokenId(String tokenId);
}
