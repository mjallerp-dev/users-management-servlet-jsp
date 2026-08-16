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
            final UserRole role){
        return new UserModel(id, name, password, role);
    }

    public UserModel update(
            final UserName name,
            final UserPassword password,
            final UserRole role){
        return new UserModel(
                this.id,
                Objects.requireNonNull(name, "UserName cannot be null"),
                Objects.requireNonNull(password, "UserPassword cannot be null"),
                Objects.requireNonNull(role, "UserRole cannot be null")
        );
    }

}
