package com.springcloud.client.commonservice.common.presentation.cookie;

public record CookieProperties(
        Long maxAge,
        String path,
        String sameSite,
        String domain,
        boolean httpOnly,
        boolean secure
) {
    public CookieProperties {
        // 기본값 설정
        if (maxAge == null) maxAge = 1234567890L;
        if (path == null) path = "/";
        if (sameSite == null) sameSite = "Lax";
        if (domain == null) domain = "localhost";
        if (httpOnly == false) httpOnly = true;
        if (secure == false) secure = false;
    }
}
