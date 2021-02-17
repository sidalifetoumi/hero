package com.example.demo.service;


import com.example.demo.entity.CourEntity;
import com.example.demo.repository.CourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourService {

    @Autowired
    private CourRepository courRepository;


    public void save(CourEntity courEntity){
        this.courRepository.save(courEntity);
    }
    public void delete(CourEntity courEntity){this.courRepository.delete(courEntity);}
    public List<CourEntity> findAll(){
        return this.courRepository.findAll();
    }
}
