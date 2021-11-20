package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import com.spring.utility.UserValidation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String getUserUsingUserNameAndPassword(HttpServletRequest httpServletRequest, Model model) {
        String userName = httpServletRequest.getParameter("userName");
        String password = httpServletRequest.getParameter("password");
        String message = userValidation.handledMessageOnLoginPage(userService.getUser(userName, password));
        System.out.println(message);
        model.addAttribute("message", message);
        if (message != "") {
            return "login";
        }
        return "home";
    }

    
    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/homeFromregistration")
    public String createUser(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "home";
    }

}
