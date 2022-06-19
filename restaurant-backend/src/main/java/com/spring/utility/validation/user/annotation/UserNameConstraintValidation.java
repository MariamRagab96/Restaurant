package com.spring.utility.validation.user.annotation;

import com.spring.utility.validation.user.annotation.UniqueUserName;
import com.spring.model.User;
import com.spring.repository.UserRepository;
import java.lang.annotation.Annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UserNameConstraintValidation implements ConstraintValidator<UniqueUserName, String> {

    @Autowired
    private UserRepository userRepository;
  
    @Override
    public boolean isValid(String username, ConstraintValidatorContext cvc) {
        User user = userRepository.findByUserName(username);
        return user == null;
    }

}
