package com.springcloud.client.authservice.member.domain;

public enum MemberStatus {
    ACTIVE("활성화된 계정"),
    ACTIVE_FIRST_LOGIN("최초 로그인된 계정"),
    DELETED("삭제된 계정"),
    INACTIVE("비활성 계정"),
    ;

    private final String description;

    public String description() {
        return description;
    }

    MemberStatus(String description) {
        this.description = description;
    }

    public boolean isFirstLogin() {
        return this == MemberStatus.ACTIVE_FIRST_LOGIN;
    }
}
