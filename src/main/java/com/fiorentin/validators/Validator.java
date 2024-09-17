package com.fiorentin.validators;

import com.fiorentin.entities.ValidationResult;
import com.fiorentin.usecases.ValidatorUseCase;

/**
 *
 * @author vanderlei.fiorentin
 * @param <T>
 */
public abstract class Validator<T> implements ValidatorUseCase {

    private ValidatorUseCase next;

    @Override
    public ValidatorUseCase and(ValidatorUseCase next) {
        if (this.getNext() == null) {
            this.setNext(next);
            return this;
        }
        
        ValidatorUseCase lastStep = this.getNext();
        
        while (lastStep.getNext() != null) {
            lastStep = lastStep.getNext();
        }
        
        lastStep.setNext(next);
        
        return this;
    }

    @Override
    public abstract ValidationResult validate();

    @Override
    public ValidationResult checkNext() {
        if (this.getNext() == null)
            return ValidationResult.valid();

        return this.getNext().validate();
    }

    @Override
    public ValidatorUseCase getNext() {
        return next;
    }

    @Override
    public void setNext(ValidatorUseCase next) {
        this.next = next;
    }

}
