package com.spring.service;

import com.spring.model.User;
import com.spring.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUsers() {
        List<User> listOfUsers = (List<User>) (userRepository.findAll());
        return listOfUsers;

    }
}
