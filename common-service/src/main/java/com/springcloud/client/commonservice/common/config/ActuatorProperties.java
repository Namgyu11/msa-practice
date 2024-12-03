package com.springcloud.client.commonservice.common.config;

public record ActuatorProperties(
        String username,
        String password,
        String role
) {
    public ActuatorProperties {
        if (username == null) username = "defaultUser";
        if (password == null) password = "defaultPass";
        if (role == null) role = "USER";
    }
}
