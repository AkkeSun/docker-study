package com.example.dockerstudy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final UserRepository userRepository;

    @GetMapping
    public String get (){
        return userRepository.findAll().toString();
    }

    @PostMapping
    public User post (User user){
        return userRepository.save(user);
    }
}
