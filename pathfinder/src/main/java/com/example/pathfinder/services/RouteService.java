package com.example.pathfinder.services;

import com.example.pathfinder.models.service.RouteServiceModel;
import com.example.pathfinder.models.view.RouteViewModel;

import java.util.List;

public interface RouteService {
    List<RouteViewModel> findAllRoutesViewModels();

    void addNewRoute(RouteServiceModel routeServiceModel);
}
