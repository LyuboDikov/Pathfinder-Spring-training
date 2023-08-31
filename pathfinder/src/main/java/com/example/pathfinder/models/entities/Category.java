package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.CategoryNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    private String description;
    private CategoryNameEnum name;

    public Category() {
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Enumerated(EnumType.STRING)
    public CategoryNameEnum getName() {
        return name;
    }

    public void setName(CategoryNameEnum name) {
        this.name = name;
    }
}
