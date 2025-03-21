package com.example.openclass.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.openclass.model.Book;
import com.example.openclass.model.User;
import com.example.openclass.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id ,User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<Book> getBookUsers(Long id) {
        return userRepository.findById(id)
        .map(User::getBooks)
        .orElseThrow(()->new RuntimeException("Books not found"));
    }
}

    
    
    

