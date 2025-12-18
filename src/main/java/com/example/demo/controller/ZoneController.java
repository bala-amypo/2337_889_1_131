package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;

@RestController
public class ZoneController {
    @Autowired
    ZoneService src;
    @PostMapping("/post")
    public Zone postdata(@RequestBody Zone st){
    return src.savedata(st);

    }
    @GetMapping("/Get")
    public List<Zone>getdata(){
        return src.retdata();
    }
    @GetMapping("/Getid/{id}")
    public Zone getIdval(@PathVariable int id){
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public Zone funName (@PathVariable int id,@RequestBody Zone st){
    return src.ids(id,st);
}
@DeleteMapping("/delete/{id}")
public Zone delData(@PathVariable int id){
    return src.isd(id);
}
}
