package ru.veretennikov.restaurants.service;

import ru.veretennikov.restaurants.domain.User;

import java.util.List;

public interface UserService {
    User get(User id);
    List<User> getAll();
    User save(User user);
    User delete(User user);
}
