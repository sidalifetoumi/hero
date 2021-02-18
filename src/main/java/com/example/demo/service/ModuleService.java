package com.example.demo.service;


import com.example.demo.entity.ModuleEntity;
import com.example.demo.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;


    public void saveModule(ModuleEntity moduleEntity){
        this.moduleRepository.save(moduleEntity);
    }


    public void deleteModule(Long id){
        this.moduleRepository.deleteById(id);
    }
    public Optional<ModuleEntity> findModule(Long id){
        return this.moduleRepository.findById(id);
    }


    public List<ModuleEntity> findAll(){
        return this.moduleRepository.findAll();
    }

    public void deleteAllModules(){
        this.moduleRepository.deleteAll();
    }

}
