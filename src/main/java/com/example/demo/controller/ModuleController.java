package com.example.demo.controller;


import com.example.demo.entity.ModuleEntity;
import com.example.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200","https://romantic-minsky-4e27dc.netlify.app"})
@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @PostMapping
    public void saveModule(@RequestBody ModuleEntity moduleEntity){
        this.moduleService.saveModule(moduleEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteModule(@PathVariable Long id){
        this.moduleService.deleteModule(id);
    }
    @DeleteMapping
    public void deleteAllModules(){
        this.moduleService.deleteAllModules();
    }
    @GetMapping("/{id}")
    public Optional<ModuleEntity> findModule(@PathVariable Long id){
        return this.moduleService.findModule(id);
    }
    @GetMapping
    public List<ModuleEntity> findAllModules(){
        return this.moduleService.findAll();
    }

}
