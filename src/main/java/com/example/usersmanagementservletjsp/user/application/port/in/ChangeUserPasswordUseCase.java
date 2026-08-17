package com.example.usersmanagementservletjsp.user.application.port.in;

import com.example.usersmanagementservletjsp.user.application.service.dto.command.ChangeUserPasswordCommand;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface ChangeUserPasswordUseCase {
    UserModel execute(@NotNull @Valid ChangeUserPasswordCommand command);
}
