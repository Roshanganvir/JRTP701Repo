package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public ResponseEntity<User> create(User user) {
        return new ResponseEntity<>(repo.save(user), HttpStatus.CREATED);
    }

    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = repo.findAll();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

//    public ResponseEntity<String> login(String email, String password) {
//        List<User> user = repo.findByEmailAndPassword(email, password);
//        if (user != null && email.equals(((User) user).getEmail()) && password.equals(((User) user).getPassword())) {
//            return new ResponseEntity<>("Login Successful", HttpStatus.OK);
//        }
//        return new ResponseEntity<>("Login Failed", HttpStatus.BAD_REQUEST);
//    }

	

	
}
