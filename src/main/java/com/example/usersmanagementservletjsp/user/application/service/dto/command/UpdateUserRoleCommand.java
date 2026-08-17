package com.example.usersmanagementservletjsp.user.application.service.dto.command;

import jakarta.validation.constraints.NotBlank;

public record UpdateUserRoleCommand(
        @NotBlank(message = "id must not be blank")
        String id,

        @NotBlank(message = "role must not be blank")
        String role
) {
}