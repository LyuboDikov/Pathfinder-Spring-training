package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.LevelEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    private String gpxCoordinate;
    private LevelEnum level;
    private String name;
    private User author;
    private String videoUrl;

    public Route() {
    }

    @Column(columnDefinition = "LONGTEXT")
    public String getGpxCoordinate() {
        return gpxCoordinate;
    }

    public void setGpxCoordinate(String gpxCoordinate) {
        this.gpxCoordinate = gpxCoordinate;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Column(unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Column
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
