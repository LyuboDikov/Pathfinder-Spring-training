package com.example.pathfinder.services.impl;

import com.example.pathfinder.models.entities.Category;
import com.example.pathfinder.models.enums.CategoryNameEnum;
import com.example.pathfinder.repositories.CategoryRepository;
import com.example.pathfinder.services.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findCategoryByName(CategoryNameEnum categoryNameEnum) {

        return categoryRepository.
                findByName(categoryNameEnum).
                orElse(null);
    }
}
