package com.example.demo.service;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.entity.ZoneEntity;
import org.springframework.stereotype.Service;

@Service
public class ZoneService {
    Map<Integer,ZoneEntity> mp = new HashMap<>();

    public ZoneEntity savedata(ZoneEntity st){
        mp.put(st.getId(),st);
        return  st;
    }
    public List<ZoneEntity>retdata(){
        return new ArrayList<>(mp.values());
    }
    public ZoneEntity id(int id) {
        return mp.get(id);
    }
    public ZoneEntity ids(int id, ZoneEntity st) {
        return mp.put(id,st);
    }
    public ZoneEntity isd(int id) {
        return mp.remove(id);
    }
}
