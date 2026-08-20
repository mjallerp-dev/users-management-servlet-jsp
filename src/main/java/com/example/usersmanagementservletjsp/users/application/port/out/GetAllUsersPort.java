package com.example.usersmanagementservletjsp.users.application.port.out;

import com.example.usersmanagementservletjsp.users.domain.model.UserModel;

import java.util.List;

public interface GetAllUsersPort {
    List<UserModel> getAll();
}
