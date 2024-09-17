package com.fiorentin.specifications;

/**
 *
 * @author vanderlei.fiorentin
 * @param <T>
 */
public interface Specification<T> {

    public boolean isSatisfiedBy(T t);
}
