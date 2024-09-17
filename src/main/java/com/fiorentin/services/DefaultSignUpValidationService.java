package com.fiorentin.services;

import com.fiorentin.entities.User;
import com.fiorentin.entities.ValidationResult;
import com.fiorentin.usecases.SignUpValidationUseCase;
import com.fiorentin.validators.EmailDuplicationValidator;
import com.fiorentin.validators.PasswordValidator;
import com.fiorentin.validators.SignUpConstraintValidator;
import com.fiorentin.validators.UsernameDuplicationValidator;

/**
 *
 * @author vanderlei.fiorentin
 */
public class DefaultSignUpValidationService implements SignUpValidationUseCase {

    @Override
    public ValidationResult validate(User user) {
        return new SignUpConstraintValidator(user)
                .and(new UsernameDuplicationValidator(user.username()))
                .and(new EmailDuplicationValidator(user.email()))
                .and(new PasswordValidator(user.password()))
                .validate();
    }

}
