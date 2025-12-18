package com.example.demo.service;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.entity.AppUser;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    Map<Integer,AppUser> mp = new HashMap<>();

    public AppUser savedata(AppUser st){
        mp.put(st.getId(),st);
        return  st;
    }
    public List<AppUser>retdata(){
        return new ArrayList<>(mp.values());
    }
    public AppUser id(int id) {
        return mp.get(id);
    }
    public AppUser ids(int id, AppUser st) {
        return mp.put(id,st);
    }
    public AppUser isd(int id) {
        return mp.remove(id);
    }
    
}
