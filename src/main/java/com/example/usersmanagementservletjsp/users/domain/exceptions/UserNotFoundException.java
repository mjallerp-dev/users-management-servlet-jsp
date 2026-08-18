package com.example.usersmanagementservletjsp.users.domain.exceptions;

import com.example.usersmanagementservletjsp.shared.domain.exceptions.DomainException;

public final class UserNotFoundException extends DomainException {

    private static final String MESSAGE_BY_ID = "The user with id '%s' was not found.";

    private UserNotFoundException(final String message) {
        super(message);
    }

    public static UserNotFoundException becauseIdWasNotFound(final String userId) {
        return new UserNotFoundException(String.format(MESSAGE_BY_ID, userId));
    }
}
