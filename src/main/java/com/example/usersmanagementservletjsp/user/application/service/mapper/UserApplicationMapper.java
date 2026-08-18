package com.example.usersmanagementservletjsp.user.application.service.mapper;

import com.example.usersmanagementservletjsp.user.application.service.dto.command.CreateUserCommand;
import com.example.usersmanagementservletjsp.user.domain.enums.UserRole;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserId;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserName;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserPassword;

public class UserApplicationMapper {

    public UserModel fromCommandToModel(final CreateUserCommand command) {
        return UserModel.create(
                new UserId(command.id()),
                new UserName(command.name()),
                UserPassword.fromPlainText(command.password()),
                UserRole.fromString(command.role())
        );
    }
}
