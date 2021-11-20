package com.spring.service;

import com.spring.model.User;
import com.spring.repository.UserRepository;
import com.spring.utility.UserValidation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(User user) {
        user.setRole("user");
        userRepository.save(user);
        System.out.println("User is added Successfully");
    }

    public List<User> getUsers() {
        List<User> listOfUsers = userRepository.findAll();
        return listOfUsers;

    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
        System.out.println("User is deleted Successfully");
    }

    public void updateUser(User user) {
        userRepository.updateUserById(user.getUserName(), user.getEmail(), user.getPhone(),
                user.getPassword(), user.getCreditLimit(), user.getRole(), user.getId());
        System.out.println("User is updated Successfully");
    }

    public User getUser(long id) {
        return userRepository.getById(id);
    }

    public User getUser(String userName, String password) {
        return userRepository.findByUserNameAndPassword(userName, password);
    }

}
