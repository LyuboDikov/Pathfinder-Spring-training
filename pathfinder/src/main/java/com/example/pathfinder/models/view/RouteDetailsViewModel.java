package com.example.pathfinder.models.view;

import com.example.pathfinder.models.entities.Picture;
import com.example.pathfinder.models.enums.LevelEnum;

import java.util.Set;

public class RouteDetailsViewModel {

    private String description;
    private String gpxCoordinates;
    private LevelEnum level;
    private String name;
    private String videoUrl;
    private Set<Picture> pictures;

    public RouteDetailsViewModel() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }
}
