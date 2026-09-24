package com.st.userservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class User {
    @Id
    String id;
    @Column(length = 25, nullable = false)
    String name;
    String email;
    String about;

}
