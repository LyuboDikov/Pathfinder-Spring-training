package com.example.pathfinder.models.binding;

import com.example.pathfinder.models.enums.CategoryNameEnum;
import com.example.pathfinder.models.enums.LevelEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public class RouteAddBindingModel {

    private String name;
    private String description;
    private MultipartFile gpxCoordinates;
    private LevelEnum level;
    private String videUrl;
    private Set<CategoryNameEnum> categories;

    public RouteAddBindingModel() {
    }

    @Size(min = 3, max = 20, message = "Route name must be between 3 and 20 characters!")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(min = 3)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(MultipartFile gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    @NotNull
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getVideUrl() {
        return videUrl;
    }

    public void setVideUrl(String videUrl) {
        this.videUrl = videUrl;
    }

    public Set<CategoryNameEnum> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryNameEnum> categories) {
        this.categories = categories;
    }
}
