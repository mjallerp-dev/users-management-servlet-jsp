package com.example.usersmanagementservletjsp.user.application.port.out;

import com.example.usersmanagementservletjsp.user.domain.model.UserModel;

public interface SaveUserPort {
    UserModel save(UserModel user);
}
