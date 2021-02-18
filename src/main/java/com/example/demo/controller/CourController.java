package com.example.demo.controller;


import com.example.demo.entity.CourEntity;
import com.example.demo.service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cour")
public class CourController {

    @Autowired
    private CourService courService;


    @PostMapping
    public void save(@RequestBody CourEntity courEntity){
        this.courService.saveCour(courEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.courService.deleteCour(id);
    }
    @DeleteMapping
    public void deleteAllCours(){
        this.courService.deleteAllCours();
    }
    @GetMapping("/{id}")
    public Optional<CourEntity> findCour(@PathVariable Long id){
        return this.courService.findCour(id);
    }
    @GetMapping
    public List<CourEntity> findAllCours(){
        return this.courService.findAllCours();
    }
}
