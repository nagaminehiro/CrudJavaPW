package br.edu.utfpr.edu.pw44s.server.controller;

import br.edu.utfpr.edu.pw44s.server.model.User;
import br.edu.utfpr.edu.pw44s.server.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        this.userRepository.save(user);
    }
}
