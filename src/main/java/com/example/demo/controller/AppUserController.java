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

import com.example.demo.entity.AppUser;
import com.example.demo.service.AppUserService;

@RestController
public class AppUserController {
    @Autowired
    AppUserService src;
    @PostMapping("/post")
    public AppUser postdata(@RequestBody AppUser st){
    return src.savedata(st);
    }
    @GetMapping("/Get")
    public List<AppUser> getdata(){
        return src.retdata();
    }
    @GetMapping("/Getid/{id}")
    public AppUser getIdval(@PathVariable int id){
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public AppUser funName(@PathVariable int id, @RequestBody AppUser st) {
    return src.idsp(id, st);
    }
    @DeleteMapping("/delete/{id}")
    public AppUser delData(@PathVariable int id) {
    return src.isdl(id);
}

}
