package com.fiorentin.specifications;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vanderlei.fiorentin
 */
public class PasswordValidSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isSatisfiedBy(String password) {
        /*
        * Ao menos uma letra maiúscula, uma minúscula, um número e um caracter especial
        */
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=.]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return !password.isBlank() && password.length() > 7 && matcher.matches();
    }

}
