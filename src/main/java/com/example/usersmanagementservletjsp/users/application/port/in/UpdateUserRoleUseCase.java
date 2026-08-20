package com.example.usersmanagementservletjsp.users.application.port.in;


import com.example.usersmanagementservletjsp.users.application.service.dto.command.UpdateUserRoleCommand;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface UpdateUserRoleUseCase {

    UserModel execute(@NotNull @Valid UpdateUserRoleCommand command);
}
