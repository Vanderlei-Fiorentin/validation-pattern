package com.fiorentin.validators;

import com.fiorentin.entities.ValidationResult;
import com.fiorentin.exceptions.EmailAlreadyExistsException;
import java.util.List;

/**
 *
 * @author vanderlei.fiorentin
 */
public class EmailDuplicationValidator extends Validator {

    private final String email;
    private final List<String> emails = List.of("admin@gmail.com", "administrador@gmail.com");

    public EmailDuplicationValidator(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        if (this.emails.contains(this.email))
            return ValidationResult.invalid(String.format("E-mail [%s] is already taken", this.email), EmailAlreadyExistsException.class);

        return checkNext();
    }

}
