package com.example.usersmanagementservletjsp.user.domain.exceptions;

import com.example.usersmanagementservletjsp.shared.domain.exceptions.DomainException;

public class InvalidUserIdException extends DomainException {

    private static final String MESSAGE_EMPTY = "The user id must not be empty";

    public InvalidUserIdException(String message) {
        super(message);
    }

    public static InvalidUserIdException becauseValueIsEmpty(){
        return new InvalidUserIdException(MESSAGE_EMPTY);
    }

}
