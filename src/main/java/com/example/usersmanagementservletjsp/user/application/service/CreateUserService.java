package com.example.usersmanagementservletjsp.user.application.service;

import com.example.usersmanagementservletjsp.user.application.port.in.CreateUserUseCase;
import com.example.usersmanagementservletjsp.user.application.port.out.SaveUserPort;
import com.example.usersmanagementservletjsp.user.application.service.dto.command.CreateUserCommand;
import com.example.usersmanagementservletjsp.user.application.service.mapper.UserApplicationMapper;
import com.example.usersmanagementservletjsp.user.domain.model.UserModel;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
public final class CreateUserService implements CreateUserUseCase {

    private final SaveUserPort saveUserPort;
    private final Validator validator;

    @Override
    public UserModel execute(final CreateUserCommand command){
        validateCommand(command);
        final UserModel userToSave = UserApplicationMapper.fromCreateCommandToModel(command);
        return saveUserPort.save(userToSave);
    }

    private void validateCommand(final CreateUserCommand command){
        final Set<ConstraintViolation<CreateUserCommand>> violations = validator.validate(command);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

}
