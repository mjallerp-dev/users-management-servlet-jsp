package com.example.usersmanagementservletjsp.users.application.service.dto.command;

import jakarta.validation.constraints.NotBlank;

public record DeleteUserCommand(
        @NotBlank(message = "id must not be blank") String id
) {

}
