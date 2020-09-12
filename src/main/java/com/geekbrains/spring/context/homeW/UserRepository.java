package com.geekbrains.spring.context.homeW;

import java.util.List;

public interface UserRepository {

    String findUserByLogin(String login);

    void save(User user);

    List<User> findAll();

    Long findUserById(String login);
    Long findUserByIdLong(Long id);
}
