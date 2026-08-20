package com.example.usersmanagementservletjsp.users.application.port.out;

import com.example.usersmanagementservletjsp.users.domain.model.UserModel;

public interface UpdateUserPort {
    UserModel update(UserModel user);
}
