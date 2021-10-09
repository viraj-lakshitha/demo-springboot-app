package io.demo.springboot.app.demospringbootapp.services;

import io.demo.springboot.app.demospringbootapp.exception.ResourceNotFoundException;
import io.demo.springboot.app.demospringbootapp.model.User;
import io.demo.springboot.app.demospringbootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public Optional<User> getUserById(Long id) throws ResourceNotFoundException {

        if (userRepository.findById(id) == null) {
            throw new ResourceNotFoundException("User Not Found !");
        }

        return userRepository.findById(id);
    }

    public List<?> getAllUsers() {
        return userRepository.findAll();
    }

    public User createNewUser(User user) {
        return userRepository.save(user);
    }

}
