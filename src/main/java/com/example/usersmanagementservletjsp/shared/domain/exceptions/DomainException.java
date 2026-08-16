package com.example.usersmanagementservletjsp.shared.domain.exceptions;

public abstract class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, final Throwable cause){
        super(message, cause);
    }
}
