package com.example.git_flow_practice.service;

import com.example.git_flow_practice.domain.User;
import com.example.git_flow_practice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }
}
