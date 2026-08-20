package com.example.usersmanagementservletjsp.users.application.service;

import com.example.usersmanagementservletjsp.users.application.port.in.UpdateUserNameUseCase;
import com.example.usersmanagementservletjsp.users.application.port.out.GetUserByIdPort;
import com.example.usersmanagementservletjsp.users.application.port.out.UpdateUserPort;
import com.example.usersmanagementservletjsp.users.application.service.dto.command.UpdateUserNameCommand;
import com.example.usersmanagementservletjsp.users.application.service.mapper.UserApplicationMapper;
import com.example.usersmanagementservletjsp.users.domain.model.UserModel;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserId;
import com.example.usersmanagementservletjsp.users.domain.valueobject.UserName;
import com.example.usersmanagementservletjsp.users.domain.exceptions.UserNotFoundException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public class UpdateUserNameService implements UpdateUserNameUseCase {

    private final GetUserByIdPort getUserByIdPort;
    private final UpdateUserPort updateUserPort;
    private final Validator validator;

    @Override
    public UserModel execute(final UpdateUserNameCommand command) {
        validateCommand(command);
        final UserId id = UserApplicationMapper.fromUpdateUserNameCommandToUserId(command);
        final UserName name = UserApplicationMapper.fromUpdateUserNameCommandToUserName(command);
        final UserModel userToUpdate = findExistingUserOrFail(id);
        final UserModel updatedUser= userToUpdate.updateName(name);
        updateUserPort.update(updatedUser);
        return updatedUser;
    }

    private void validateCommand(final UpdateUserNameCommand command){
        final Set<ConstraintViolation<UpdateUserNameCommand>> violations = validator.validate(command);
        if (!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
    }

    private UserModel findExistingUserOrFail(final UserId id){
        return getUserByIdPort.getById(id)
                .orElseThrow(() -> UserNotFoundException.becauseIdWasNotFound(id.value()));
    }

}