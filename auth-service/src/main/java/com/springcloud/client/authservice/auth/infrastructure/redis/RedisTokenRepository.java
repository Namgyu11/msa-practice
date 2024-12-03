package com.springcloud.client.authservice.auth.infrastructure.redis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springcloud.client.authservice.auth.domain.Token;
import com.springcloud.client.authservice.auth.domain.repository.TokenRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedisTokenRepository implements TokenRepository {

    private static final Long TTL = 10_080L;  // FIXME: 임시 TTL 10,080 분 (7일)
    private static final String TOKEN_PREFIX = "token:";

    private final ObjectMapper objectMapper;
    @Override
    public void save(Token token) {

    }

    @Override
    public void deleteByTokenId(String tokenId) {

    }

    @Override
    public Optional<Token> findByTokenId(String tokenId) {
        return Optional.empty();
    }
}
