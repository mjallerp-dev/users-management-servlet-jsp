package com.example.usersmanagementservletjsp.users.application.port.in;

import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import java.util.List;

public interface GetAllUsersUseCase {
    List<UserModel> execute();
}
