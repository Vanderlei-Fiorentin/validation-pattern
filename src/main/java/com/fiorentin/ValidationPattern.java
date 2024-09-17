package com.fiorentin;

import com.fiorentin.entities.User;
import com.fiorentin.services.DefaultSignUpValidationService;

/**
 *
 * @author vanderlei.fiorentin
 */
public class ValidationPattern {

    public static void main(String[] args) throws Throwable {
        User user = new User("João", "Silva", "joao.silva", "joao@gmail.com", "password@123");

        new DefaultSignUpValidationService()
                .validate(user)
                .orElseThrow();
    }
}
