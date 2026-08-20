package com.example.usersmanagementservletjsp.users.application.port.in;

import com.example.usersmanagementservletjsp.users.application.service.dto.command.ChangeUserPasswordCommand;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface ChangeUserPasswordUseCase {
    UserModel execute(@NotNull @Valid ChangeUserPasswordCommand command);
}
