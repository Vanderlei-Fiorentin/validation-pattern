package com.fiorentin.usecases;

import com.fiorentin.entities.User;
import com.fiorentin.entities.ValidationResult;

/**
 *
 * @author vanderlei.fiorentin
 */
public interface SignUpValidationUseCase {
    
    ValidationResult validate(User user);

}
