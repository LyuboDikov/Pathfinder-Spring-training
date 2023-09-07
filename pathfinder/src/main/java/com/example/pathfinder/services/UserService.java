package com.example.pathfinder.services;

import com.example.pathfinder.models.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);

    void loginUser(long id, String username);

    void logout();

    UserServiceModel findById(Long id);
}
