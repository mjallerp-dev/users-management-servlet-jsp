package com.example.usersmanagementservletjsp.user.application.port.in;

import com.example.usersmanagementservletjsp.user.application.service.dto.query.GetUserByIdQuery;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface GetUserByIdUseCase {
    UserModel execute(@NotNull @Valid GetUserByIdQuery query);
}
