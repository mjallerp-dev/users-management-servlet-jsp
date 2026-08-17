package com.example.usersmanagementservletjsp.user.application.service.dto.query;

import jakarta.validation.constraints.NotBlank;

public record GetUserByIdQuery(@NotBlank(message = "id must not be blank") String id)
{

}