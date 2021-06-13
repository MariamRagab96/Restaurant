package com.spring.code;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class RestaurantApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(RestaurantApplication.class, args);
//	}
//
//}

import com.spring.code.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestaurantApplication {

public static void main(String[] args) {
SpringApplication.run(RestaurantApplication.class, args);
User user =new User();
user.setFirstName("Mariooma");
    System.out.println(user);
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "Mariam") String name) {
return String.format("Hello %s!", name);
}
}