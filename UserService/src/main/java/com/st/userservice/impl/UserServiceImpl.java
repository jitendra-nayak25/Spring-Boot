package com.st.userservice.impl;

import com.st.userservice.entity.User;
import com.st.userservice.exception.UserNotFoundException;
import com.st.userservice.repository.UserRepo;
import com.st.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        List<User> alluser = userRepo.findAll();
        return alluser;
    }

    @Override
    public User getOneUser(String id) {
        Optional<User> u =userRepo.findById(id);
        return u.orElseThrow(() -> new UserNotFoundException("User not present in id"+ id));
    }

    @Override
    public User createUser(User u) {
        User u1 = userRepo.save(u);
        return null;
    }

    @Override
    public boolean updateUser(String id, User u) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }
}
