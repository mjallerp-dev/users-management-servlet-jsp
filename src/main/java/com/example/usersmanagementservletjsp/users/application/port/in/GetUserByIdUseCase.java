package com.example.usersmanagementservletjsp.users.application.port.in;

import com.example.usersmanagementservletjsp.users.application.service.dto.query.GetUserByIdQuery;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface GetUserByIdUseCase {
    UserModel execute(@NotNull @Valid GetUserByIdQuery query);
}
