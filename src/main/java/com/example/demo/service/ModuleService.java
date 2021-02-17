package com.example.demo.service;


import com.example.demo.entity.ModuleEntity;
import com.example.demo.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;


    public void saveModule(ModuleEntity moduleEntity){
        this.moduleRepository.save(moduleEntity);
    }

    public void deleteModule(ModuleEntity moduleEntity){
        this.moduleRepository.delete(moduleEntity);
    }


    public void deleteModulebyId(Long id){
        this.moduleRepository.deleteById(id);
    }

    public List<ModuleEntity> findAll(){
        return this.moduleRepository.findAll();
    }

}
