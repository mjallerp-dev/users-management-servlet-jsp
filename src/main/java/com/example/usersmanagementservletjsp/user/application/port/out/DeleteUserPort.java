package com.example.usersmanagementservletjsp.user.application.port.out;

import com.example.usersmanagementservletjsp.user.domain.valueobject.UserId;

public interface DeleteUserPort {
    void delete(UserId id);
}
