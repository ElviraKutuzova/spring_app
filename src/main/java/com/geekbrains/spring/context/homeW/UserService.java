package com.geekbrains.spring.context.homeW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public void setMemoryUserRepository(MemoryUserRepository memoryUserRepository) {
        this.userRepository = memoryUserRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public String findUserByLogin(String login){
        return userRepository.findUserByLogin(login);
    }
    public Long findUserById(String login){
        return userRepository.findUserById(login);
    }
    public Long findUserByIdLong(Long id){
        return userRepository.findUserByIdLong(id);
    }

    public User getCurrentUser(){
        return new User(1L, "Tom");
    }
}
