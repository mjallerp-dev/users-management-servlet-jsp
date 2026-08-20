package com.example.usersmanagementservletjsp.users.application.service.mapper;

import com.example.usersmanagementservletjsp.users.application.service.dto.command.ChangeUserPasswordCommand;
import com.example.usersmanagementservletjsp.users.application.service.dto.command.CreateUserCommand;
import com.example.usersmanagementservletjsp.users.application.service.dto.command.UpdateUserNameCommand;
import com.example.usersmanagementservletjsp.users.application.service.dto.command.UpdateUserRoleCommand;
import com.example.usersmanagementservletjsp.users.domain.enums.UserRole;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserId;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserName;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserPassword;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserApplicationMapper {

    public UserModel fromCreateCommandToModel(final CreateUserCommand command) {
        return UserModel.create(
                new UserId(command.id()),
                new UserName(command.name()),
                UserPassword.fromPlainText(command.password()),
                UserRole.fromString(command.role())
        );
    }

    public UserId fromUpdateUserNameCommandToUserId(final UpdateUserNameCommand command) {
        return new UserId(command.id());
    }

    public UserName fromUpdateUserNameCommandToUserName(final UpdateUserNameCommand command) {
        return new UserName(command.name());
    }

    public UserId fromChangePasswordCommandToUserId(final ChangeUserPasswordCommand command) {
        return new UserId(command.id());
    }

    public UserPassword fromChangePasswordCommandToUserPassword (final ChangeUserPasswordCommand command){
        return UserPassword.fromPlainText(command.password());
    }

    public UserId fromUpdateUserRoleCommandToUserId (final UpdateUserRoleCommand command){
        return new UserId(command.id());
    }

    public UserRole fromUpdateUserRoleCommandToUserRole (final UpdateUserRoleCommand command){
        return UserRole.fromString(command.role());
    }

}
