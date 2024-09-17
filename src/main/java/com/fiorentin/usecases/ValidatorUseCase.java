package com.fiorentin.usecases;

import com.fiorentin.entities.ValidationResult;

/**
 *
 * @author vanderlei.fiorentin
 */
public interface ValidatorUseCase {

    public ValidatorUseCase and(ValidatorUseCase next);

    public abstract ValidationResult validate();

    public ValidationResult checkNext();

    public ValidatorUseCase getNext();

    public void setNext(ValidatorUseCase next);

}
