package com.fiorentin.specifications;

/**
 *
 * @author vanderlei.fiorentin
 * @param <T>
 */
public abstract class AbstractSpecification<T> implements Specification<T> {

    @Override
    public abstract boolean isSatisfiedBy(T t);

    public AbstractSpecification<T> or(Specification<T> s) {
        return new OrSpecification<>(this, s);
    }

    public AndSpecification<T> and(Specification<T> s) {
        return new AndSpecification<>(this, s);
    }

    public AbstractSpecification<T> not() {
        return new NotSpecification<>(this);
    }

}
