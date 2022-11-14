package com.augustyne.inputApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.augustyne.inputApp.model.Files;

@Repository
public interface FilesRepository extends JpaRepository<Files,Integer> {
    
}
