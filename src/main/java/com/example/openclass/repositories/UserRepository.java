package com.example.openclass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.openclass.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
