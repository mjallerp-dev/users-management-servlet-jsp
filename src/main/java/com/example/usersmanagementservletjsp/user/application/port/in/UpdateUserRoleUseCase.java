package com.example.usersmanagementservletjsp.user.application.port.in;


import com.example.usersmanagementservletjsp.user.application.service.dto.command.UpdateUserRoleCommand;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface UpdateUserRoleUseCase {

    UserModel execute(@NotNull @Valid UpdateUserRoleCommand command);
}
