package com.example.git_flow_practice.repository;

import com.example.git_flow_practice.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findById();
    User findByName();
}
