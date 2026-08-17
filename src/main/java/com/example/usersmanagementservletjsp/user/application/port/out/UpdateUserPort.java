package com.example.usersmanagementservletjsp.user.application.port.out;

import com.example.usersmanagementservletjsp.user.domain.model.UserModel;

public interface UpdateUserPort {
    UserModel update(UserModel user);
}
