package io.demo.springboot.app.demospringbootapp.controller.api.v1;

import io.demo.springboot.app.demospringbootapp.exception.ResourceNotFoundException;
import io.demo.springboot.app.demospringbootapp.model.User;
import io.demo.springboot.app.demospringbootapp.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
        return userServices.getUserById(id);
    }

    @GetMapping
    public List<?> getAllUser() {
        return userServices.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userServices.createNewUser(user);
    }
}
