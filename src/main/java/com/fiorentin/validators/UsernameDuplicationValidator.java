package com.fiorentin.validators;

import com.fiorentin.entities.ValidationResult;
import com.fiorentin.exceptions.UserAlreadyExistsException;
import java.util.List;

/**
 *
 * @author vanderlei.fiorentin
 */
public class UsernameDuplicationValidator extends Validator {

    private final String username;
    private final List<String> usernames = List.of("admin", "administrador");

    public UsernameDuplicationValidator(String username) {
        this.username = username;
    }

    @Override
    public ValidationResult validate() {
        if (this.usernames.contains(this.username))
            return ValidationResult.invalid(String.format("Username [%s] is already taken", this.username), UserAlreadyExistsException.class);

        return checkNext();
    }

}
