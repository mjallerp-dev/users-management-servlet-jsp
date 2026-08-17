package com.example.usersmanagementservletjsp.user.application.port.in;

import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import java.util.List;

public interface GetAllUsersUseCase {
    List<UserModel> execute();
}
