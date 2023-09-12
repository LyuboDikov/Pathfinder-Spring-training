package com.example.pathfinder.services.impl;

import com.example.pathfinder.models.entities.Route;
import com.example.pathfinder.models.service.RouteServiceModel;
import com.example.pathfinder.models.view.RouteViewModel;
import com.example.pathfinder.repositories.RouteRepository;
import com.example.pathfinder.services.CategoryService;
import com.example.pathfinder.services.RouteService;
import com.example.pathfinder.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final CategoryService categoryService;

    public RouteServiceImpl(RouteRepository routeRepository,
                            ModelMapper modelMapper,
                            UserService userService,
                            CategoryService categoryService) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @Override
    public List<RouteViewModel> findAllRoutesViewModels() {

        return routeRepository.findAll().stream().map(route -> {
            RouteViewModel routeViewModel = modelMapper.map(route, RouteViewModel.class);

            if (route.getPictures().isEmpty()) {
                routeViewModel.setPictureUrl("/images/pic4.jpg");
            } else {
                routeViewModel.setPictureUrl(route.getPictures().stream().findFirst().get().getUrl());
            }
            return routeViewModel;
        }).toList();
    }

    @Override
    public void addNewRoute(RouteServiceModel routeServiceModel) {
        Route route = modelMapper.map(routeServiceModel, Route.class);

        route.setAuthor(userService.findCurrentLoginUserEntity());

        route.setCategories(routeServiceModel.
                getCategories().
                stream().
                map(categoryService::findCategoryByName).
                collect(Collectors.toSet()));


        routeRepository.save(route);
    }
}
