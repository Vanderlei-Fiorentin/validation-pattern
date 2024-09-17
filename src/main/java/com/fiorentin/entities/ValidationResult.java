package com.fiorentin.entities;

/**
 *
 * @author vanderlei.fiorentin
 */
public class ValidationResult {

    private final boolean isSatisfied;
    private final String message;
    private final Class<? extends Throwable> exception;
    
    public ValidationResult(boolean isSatisfied, String message, Class<? extends Throwable> exception) {
        this.isSatisfied = isSatisfied;
        this.message = message;
        this.exception = exception;
    }

    public static ValidationResult valid() {
        return new ValidationResult(true, null, null);
    }

    public static ValidationResult invalid(String message) {
        return new ValidationResult(false, message, Exception.class);
    }
    
    public static ValidationResult invalid(String message, Class<? extends Throwable> exception) {
        return new ValidationResult(false, message, exception);
    }

    public boolean isSatisfied() {
        return this.isSatisfied;
    }

    public String getMessage() {
        return this.message;
    }
    
    public void orElseThrow() throws Throwable {
        if (!this.isSatisfied())
            throw exception.getConstructor(String.class).newInstance(this.message);
    }
    
    public void orElseThrow(Throwable exception) throws Throwable {
        if (!this.isSatisfied())
            throw exception;
    }

}
