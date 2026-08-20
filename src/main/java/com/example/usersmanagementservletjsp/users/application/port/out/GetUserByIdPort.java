package com.example.usersmanagementservletjsp.users.application.port.out;

import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserId;

import java.util.Optional;

public interface GetUserByIdPort {
    Optional<UserModel> getById(UserId id);
}
