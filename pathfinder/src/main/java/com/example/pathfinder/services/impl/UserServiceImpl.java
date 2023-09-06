package com.example.pathfinder.services.impl;

import com.example.pathfinder.models.entities.User;
import com.example.pathfinder.models.enums.LevelEnum;
import com.example.pathfinder.models.service.UserServiceModel;
import com.example.pathfinder.repositories.UserRepository;
import com.example.pathfinder.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {

        User user = modelMapper.map(userServiceModel, User.class);
        user.setLevel(LevelEnum.BEGINNER);

        userRepository.save(user);
    }
}
