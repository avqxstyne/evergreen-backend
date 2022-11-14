package com.augustyne.inputApp.service;

import java.util.List;

import com.augustyne.inputApp.model.Files;

public interface FilesService {
    public Files saveFiles(Files files);
    public List<Files> getAllFiles();
}
