package com.example.usersmanagementservletjsp.user.application.port.out;

import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserId;

import java.util.Optional;

public interface GetUserByIdPort {
    Optional<UserModel> getById(UserId id);
}
