package com.fiorentin.specifications;

/**
 *
 * @author vanderlei.fiorentin
 * @param <T>
 */
public class OrSpecification<T> extends AbstractSpecification<T> {

    private final Specification<T> left;
    private final Specification<T> right;

    public OrSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        return this.left.isSatisfiedBy(t) || this.right.isSatisfiedBy(t);
    }

}
