package com.example.usersmanagementservletjsp.user.application.service.dto.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ChangeUserPasswordCommand(
        @NotBlank(message = "id must not be blank")
        String id,
        @NotBlank(message = "password must not be blank")
        @Size(min = 8, message = "password must have at least 8 characters")
        String password
) {
}