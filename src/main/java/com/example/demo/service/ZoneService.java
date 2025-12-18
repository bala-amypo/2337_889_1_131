package com.example.demo.service;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.entity.;
import org.springframework.stereotype.Service;

@Service
public class ZoneService {
    Map<Integer,Zone> mp = new HashMap<>();

    public Zone savedata(Zone st){
        mp.put(st.getId(),st);
        return  st;
    }
    public List<Zone>retdata(){
        return new ArrayList<>(mp.values());
    }
    public Zone id(int id) {
        return mp.get(id);
    }
    public Zone ids(int id, Zone st) {
        return mp.put(id,st);
    }
    public Zone isd(int id) {
        return mp.remove(id);
    }
}
