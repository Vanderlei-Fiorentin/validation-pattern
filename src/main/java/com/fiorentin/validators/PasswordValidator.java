package com.fiorentin.validators;

import com.fiorentin.specifications.PasswordValidSpecification;
import com.fiorentin.entities.ValidationResult;
import com.fiorentin.exceptions.BusinessException;

/**
 *
 * @author vanderlei.fiorentin
 */
public class PasswordValidator extends Validator {

    private final String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    @Override
    public ValidationResult validate() {
        boolean isSatisfied = new PasswordValidSpecification()
                .isSatisfiedBy(this.password);
        
        if (!isSatisfied)
            return ValidationResult.invalid("Password is invalid.", BusinessException.class);

        return checkNext();
    }

}
