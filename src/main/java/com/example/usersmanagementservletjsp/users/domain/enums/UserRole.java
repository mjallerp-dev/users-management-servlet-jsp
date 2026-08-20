package com.example.usersmanagementservletjsp.users.domain.enums;

import com.example.usersmanagementservletjsp.users.domain.exceptions.InvalidUserRoleException;
import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN(3),
    REVIEWER(2),
    MEMBER(1);

    private final int level;

    UserRole(final int level) {
        this.level = level;
    }

    public static UserRole fromString(final String value) {
        for (final UserRole role : values()) {
            if (role.name().equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw InvalidUserRoleException.becauseValueIsInvalid(value);
    }
}