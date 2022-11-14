package com.augustyne.inputApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustyne.inputApp.model.Files;
import com.augustyne.inputApp.repository.FilesRepository;

@Service
public class FilesServiceImpl implements FilesService {
    
    @Autowired
    private FilesRepository filesRepository;

    @Override
    public Files saveFiles(Files files) {
        return filesRepository.save(files);
    }

    @Override
    public List<Files> getAllFiles() {
        return filesRepository.findAll();
    }

}
