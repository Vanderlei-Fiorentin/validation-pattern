package com.fiorentin.exceptions;

/**
 *
 * @author vanderlei.fiorentin
 */
public class UserAlreadyExistsException extends Throwable {

    public UserAlreadyExistsException(String message) {
        super(message);
    }

}
