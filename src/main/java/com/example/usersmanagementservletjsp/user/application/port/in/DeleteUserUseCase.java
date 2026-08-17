package com.example.usersmanagementservletjsp.user.application.port.in;

import com.example.usersmanagementservletjsp.user.application.service.dto.command.DeleteUserCommand;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface DeleteUserUseCase {
    void execute(@NotNull @Valid DeleteUserCommand command);
}
