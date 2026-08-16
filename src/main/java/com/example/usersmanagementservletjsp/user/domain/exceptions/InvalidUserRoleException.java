package com.example.usersmanagementservletjsp.user.domain.exceptions;

import com.example.usersmanagementservletjsp.shared.domain.exceptions.DomainException;

public final class InvalidUserRoleException extends DomainException {

    private static final String MESSAGE_INVALID = "The user role '%s' is not valid.";

    private InvalidUserRoleException(final String message) {
        super(message);
    }

    public static InvalidUserRoleException becauseValueIsInvalid(final String role) {
        return new InvalidUserRoleException(String.format(MESSAGE_INVALID, role));
    }
}
