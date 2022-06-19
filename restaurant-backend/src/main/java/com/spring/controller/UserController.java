package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import com.spring.utility.validation.user.UserValidation;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidation userValidation;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/homeFromLogin")
    public String getUserUsingUserNameAndPassword(@RequestParam("username") String userName,
            @RequestParam("password") String password, Model model) {
        String message = userValidation.handledMessageOnLoginPage(userService.getUser(userName, password));
        System.out.println(message);
        model.addAttribute("message", message);
        return message != "" ? "login" : "home";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/homeFromRegistration")
    public String createUser(@Valid @ModelAttribute("user") @RequestBody User user, BindingResult bindingResult) {
        System.out.println("bindingResult | " + bindingResult);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.createUser(user);
        return "home";
    }

}
