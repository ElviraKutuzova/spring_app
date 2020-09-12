package com.geekbrains.spring.context.homeW;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class MemoryUserRepository implements UserRepository {
    
    private List<User> users;

    @PostConstruct
    public void init(){
        users = new ArrayList<>(Arrays.asList(
                new User(1L, "Tom"),
                new User(2L, "Liza"),
                new User(3L, "Ren"),
                new User(4L, "Karl"),
                new User(5L, "Mary")

        ));
    }

    public List<User> findAll(){
        return Collections.unmodifiableList(users);
    }


    public String findUserByLogin(String login){
        for (User i : users){
            if(i.getLogin().equals(login)){
                return i.getLogin();
            }
        }
        throw new RuntimeException("Login user not found");
    }

    public Long findUserById(String login){
        for (User i : users){
            if(i.getLogin().equals(login)){
                return i.getId();
            }
        }
        throw new RuntimeException("Id user not found");
    }

    public Long findUserByIdLong(Long id){
        for (User i : users){
            if(i.getId().equals(id)){
                return i.getId();
            }
        }
        throw new RuntimeException("Id user not found");
    }

    public void save(User user) {
        users.add(user);
    }
}
