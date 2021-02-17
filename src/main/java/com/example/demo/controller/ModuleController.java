package com.example.demo.controller;


import com.example.demo.entity.ModuleEntity;
import com.example.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @PostMapping
    public void saveModule(@RequestBody ModuleEntity moduleEntity){
        this.moduleService.saveModule(moduleEntity);
    }

    @DeleteMapping
    public void deleteModule(@RequestBody ModuleEntity moduleEntity){
        this.moduleService.deleteModule(moduleEntity);
    }

    @GetMapping("/all")
    public List<ModuleEntity> findAllModules(){
        return this.moduleService.findAll();
    }

}
