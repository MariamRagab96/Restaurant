package com.spring.utility.validation.user;

import com.spring.model.User;
import com.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserValidation {

    public boolean isUserExist(User user) {
        return user == null ? false : true;
    }

    public String handledMessageOnLoginPage(User user) {
        return isUserExist(user) ? "" : "invaled User name or password , Please try agin !";

    }

    public boolean isUserNameExist(User user) {
        return user == null ? false : true;
    }

    public boolean isEmailExist(User user) {
        return user == null ? false : true;
    }
}
