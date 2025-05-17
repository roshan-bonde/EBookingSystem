package com.roshan.EBookingSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.EBookingSystem.Entity.User;
import com.roshan.EBookingSystem.Repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUserById(Integer userId) {
        return userRepo.findById(userId).orElse(null);
    }

    public User getUserByUserName(User user) {
        return userRepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
    }

    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public Integer deleteUser(User user) {
        return userRepo.deleteByUserNameAndPassword(user.getUserName(), user.getPassword());
    }

}
