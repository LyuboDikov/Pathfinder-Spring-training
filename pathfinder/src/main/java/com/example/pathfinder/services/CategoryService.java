package com.example.pathfinder.services;


import com.example.pathfinder.models.entities.Category;
import com.example.pathfinder.models.enums.CategoryNameEnum;

public interface CategoryService {

    Category findCategoryByName(CategoryNameEnum categoryNameEnum);
}
