package com.example.usersmanagementservletjsp.user.application.port.out;

import com.example.usersmanagementservletjsp.user.domain.model.UserModel;

import java.util.List;

public interface GetAllUsersPort {
    List<UserModel> getAll();
}
