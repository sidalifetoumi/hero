package com.example.demo.service;


import com.example.demo.entity.CourEntity;
import com.example.demo.repository.CourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourService {

    @Autowired
    private CourRepository courRepository;


    public void saveCour(CourEntity courEntity){
        this.courRepository.save(courEntity);
    }

    public void deleteCour(Long id){
        this.courRepository.deleteById(id);
    }
    public void deleteAllCours(){
        this.courRepository.deleteAll();
    }
    public Optional<CourEntity> findCour(Long id){
        return this.courRepository.findById(id);
    }

    public List<CourEntity> findAllCours(){
        return this.courRepository.findAll();
    }
}
