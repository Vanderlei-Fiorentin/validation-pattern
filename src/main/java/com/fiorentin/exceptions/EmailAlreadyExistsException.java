package com.fiorentin.exceptions;

/**
 *
 * @author vanderlei.fiorentin
 */
public class EmailAlreadyExistsException extends Throwable {

    public EmailAlreadyExistsException(String message) {
        super(message);
    }

}
