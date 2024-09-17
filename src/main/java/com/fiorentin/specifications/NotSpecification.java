package com.fiorentin.specifications;

/**
 *
 * @author vanderlei.fiorentin
 * @param <T>
 */
public class NotSpecification<T> extends AbstractSpecification<T> {

    private final Specification<T> spec;

    public NotSpecification(Specification<T> spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        return !spec.isSatisfiedBy(t);
    }

}
