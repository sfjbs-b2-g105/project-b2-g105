package com.jwt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.api.entity.User;
import com.jwt.api.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "akhila", "pwd1", "akhila@gmail.com"),
                new User(102, "sakshi", "pwd2", "sakshi@gmail.com"),
                new User(103, "naveen", "pwd3", "naveen@gmail.com"),
                new User(104, "bhagya", "pwd4", "bhagya@gmail.com"),
                new User(104, "vani", "pwd5", "vani@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
