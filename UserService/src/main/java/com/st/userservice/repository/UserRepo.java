package com.st.userservice.repository;

import com.st.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,String> {

    List<User> id(String id);
}
