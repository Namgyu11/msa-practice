package com.springcloud.client.authservice.auth.exception;

import com.springcloud.client.commonservice.common.exception.BaseException;

public class AuthException extends BaseException {

    public AuthException(AuthExceptionType authExceptionType) {
        super(authExceptionType);
    }
}
