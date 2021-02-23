package com.dailycodeBuffere.Userservice.services;

import com.dailycodeBuffere.Userservice.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dailycodeBuffere.Userservice.repositories.UserRepo;

@Service
public class UserService {

Logger log = LoggerFactory.getLogger(UserService.class);

@Autowired
private UserRepo userRepo;

    public User saveUser(User user) {
        log.info("save User get Called ");
        return userRepo.save(user);
    }
}
