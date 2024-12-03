package com.springcloud.client.authservice.auth.domain;

import static com.springcloud.client.authservice.auth.exception.AuthExceptionType.UN_MATCH_USER_INFO;

import com.springcloud.client.authservice.auth.exception.AuthException;
import java.util.Objects;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Token {

    private Long memberId;
    private String tokenId;

    @Builder
    public Token(Long memberId, String tokenId) {
        this.memberId = memberId;
        this.tokenId = tokenId;
    }

    public void isMatchOrElseThrow(Long memberId){
        if(!Objects.equals(memberId,this.memberId)){
            throw new AuthException(UN_MATCH_USER_INFO);
        }
    }

    private String generateTokenId(){
        return UUID.randomUUID().toString();
    }
}
