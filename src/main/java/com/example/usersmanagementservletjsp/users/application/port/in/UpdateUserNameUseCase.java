package com.example.usersmanagementservletjsp.users.application.port.in;

import com.example.usersmanagementservletjsp.users.application.service.dto.command.UpdateUserNameCommand;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface UpdateUserNameUseCase {
    UserModel execute(@NotNull @Valid UpdateUserNameCommand command);
}
