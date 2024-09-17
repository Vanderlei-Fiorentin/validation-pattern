package com.fiorentin.validators;

import com.fiorentin.entities.User;
import com.fiorentin.entities.ValidationResult;
import com.fiorentin.exceptions.BusinessException;

/**
 *
 * @author vanderlei.fiorentin
 */
public class SignUpConstraintValidator extends Validator {
    
    private final User user;
    
    public SignUpConstraintValidator(User user) {
        this.user = user;
    }

    @Override
    public ValidationResult validate() {
        if (this.user.firstName() == null)
            return ValidationResult.invalid("First name is required.", BusinessException.class);
        
        if (this.user.email() == null)
            return ValidationResult.invalid("E-mail is required.", BusinessException.class);
        
        if (this.user.username() == null)
            return ValidationResult.invalid("Username is required.", BusinessException.class);
        
        if (this.user.password() == null)
            return ValidationResult.invalid("Password is required.", BusinessException.class);
        
        return checkNext();
    }
    
}
