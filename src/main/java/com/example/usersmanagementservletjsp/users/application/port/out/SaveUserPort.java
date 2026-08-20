package com.example.usersmanagementservletjsp.users.application.port.out;

import com.example.usersmanagementservletjsp.users.domain.model.UserModel;

public interface SaveUserPort {
    UserModel save(UserModel user);
}
