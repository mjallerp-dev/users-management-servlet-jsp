package com.example.usersmanagementservletjsp.users.application.port.out;

import com.example.usersmanagementservletjsp.users.domain.valueobject.UserId;

public interface DeleteUserPort {
    void delete(UserId id);
}
