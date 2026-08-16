package com.example.usersmanagementservletjsp.user.domain.valueobject;

import com.example.usersmanagementservletjsp.user.domain.exceptions.InvalidUserPasswordException;

public final class UserPassword {

    private static final int MINIMUM_LENGTH = 8;
    private static final int BCRYPT_COST = 12;

    private final String value;

    private UserPassword(final String value) {
        this.value = value;
    }

    private static void validateNotEmpty(final String normalizedValue){
        if (normalizedValue.isEmpty()) {
            throw InvalidUserPasswordException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String normalizedValue) {
        if (normalizedValue.length() < MINIMUM_LENGTH) {
            throw InvalidUserPasswordException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }
}