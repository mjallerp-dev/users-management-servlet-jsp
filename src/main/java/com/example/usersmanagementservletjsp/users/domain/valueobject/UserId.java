package com.example.usersmanagementservletjsp.users.domain.valueobject;

import com.example.usersmanagementservletjsp.users.domain.exceptions.InvalidUserIdException;

import java.util.Objects;

public record UserId (String value) {

    public UserId {final String normalizedValue = Objects.requireNonNull(value, "UserId cannot be null").trim();
        validateNotEmpty(normalizedValue);
        value = normalizedValue;
    }

    public static void validateNotEmpty(final String normalizedValue){
        if (normalizedValue.isEmpty()){
            throw InvalidUserIdException.becauseValueIsEmpty();
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
