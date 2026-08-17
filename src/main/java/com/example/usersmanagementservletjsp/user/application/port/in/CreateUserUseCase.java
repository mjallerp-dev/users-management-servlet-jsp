package com.example.usersmanagementservletjsp.user.application.port.in;

import com.example.usersmanagementservletjsp.user.application.service.dto.command.CreateUserCommand;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface CreateUserUseCase {
    UserModel execute(@NotNull @Valid CreateUserCommand command);
}
