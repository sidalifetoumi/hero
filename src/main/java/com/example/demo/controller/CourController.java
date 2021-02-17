package com.example.demo.controller;


import com.example.demo.entity.CourEntity;
import com.example.demo.service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cour")
public class CourController {

    @Autowired
    private CourService courService;


    @PostMapping
    public void save(@RequestBody CourEntity courEntity){
        this.courService.save(courEntity);
    }

    @DeleteMapping
    public void delete(@RequestBody CourEntity courEntity){
        this.courService.delete(courEntity);
    }

    @GetMapping("/all")
    public List<CourEntity> findAll(){
        return this.courService.findAll();
    }
}
