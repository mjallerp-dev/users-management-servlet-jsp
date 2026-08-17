package com.example.usersmanagementservletjsp.user.domain.model;

import com.example.usersmanagementservletjsp.user.domain.enums.UserRole;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserId;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserName;
import com.example.usersmanagementservletjsp.user.domain.valueobject.UserPassword;
import lombok.Value;

import java.util.Objects;

@Value
public class UserModel {

    UserId id;
    UserName name;
    UserPassword password;
    UserRole role;

    public static UserModel create(
            final UserId id,
            final UserName name,
            final UserPassword password,
            final UserRole role
    ) {
        return new UserModel(
                Objects.requireNonNull(id, "Id cannot be null"),
                Objects.requireNonNull(name, "Name cannot be null"),
                Objects.requireNonNull(password, "Password cannot be null"),
                Objects.requireNonNull(role, "Role cannot be null")
        );
    }

    public UserModel updateName(final UserName name) {
        return new UserModel(
                this.id,
                Objects.requireNonNull(name, "Name cannot be null"),
                this.password,
                this.role
        );
    }

    public UserModel changePassword(final UserPassword password) {
        return new UserModel(
                this.id,
                this.name,
                Objects.requireNonNull(password, "Password cannot be null"),
                this.role
        );
    }

    public UserModel updateRole(final UserRole role) {
        return new UserModel(
                this.id,
                this.name,
                this.password,
                Objects.requireNonNull(role, "Role cannot be null")
        );
    }
}
