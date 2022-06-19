package com.spring.utility.validation.user.annotation;

import com.spring.utility.validation.user.annotation.UniqueEmail;
import com.spring.model.User;
import com.spring.repository.UserRepository;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

class EmailConstraintValidation implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext cvc) {
        User user = userRepository.findByEmail(email);
        return user == null;
    }

}
