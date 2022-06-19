package com.spring.Rest;

import com.spring.dto.UserDTO;
import com.spring.model.User;
import com.spring.service.UserService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public void createUser(@Valid @RequestBody  User user) {
        userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/user/search")
    public User getUser(@RequestParam String userName, @RequestParam String password) {
        System.out.println(userService.getUser(userName, password));
        return userService.getUser(userName, password);
    }

    @PostMapping("/user/search")
    public User getUser1(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        return userService.getUser(userDTO);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/user")
    public void updateUser(@Valid @RequestBody User user) {
        userService.updateUser(user);
    }

}
