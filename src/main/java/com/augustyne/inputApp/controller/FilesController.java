package com.augustyne.inputApp.controller;

import com.augustyne.inputApp.model.Files;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.augustyne.inputApp.service.FilesService;

@RestController
@RequestMapping("/files")
public class FilesController {
    
    @Autowired
    private FilesService filesService;

    @CrossOrigin
    @PostMapping("/add")
    public String add(@RequestBody Files files) {
        filesService.saveFiles(files);
        
        return "File added";
    }

    @GetMapping("/getAll")
    public List<Files> getAllFiles() {
        return filesService.getAllFiles();
    }

}
