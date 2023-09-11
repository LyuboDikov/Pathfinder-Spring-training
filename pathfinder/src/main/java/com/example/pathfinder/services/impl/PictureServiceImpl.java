package com.example.pathfinder.services.impl;

import com.example.pathfinder.repositories.PictureRepository;
import com.example.pathfinder.services.PictureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }
    @Override
    public List<String> findAllUrls() {
        return pictureRepository.findAllUrls();
    }
}
