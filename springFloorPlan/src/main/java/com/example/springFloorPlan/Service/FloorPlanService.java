package com.example.springFloorPlan.Service;



import com.example.springFloorPlan.model.Floor_coordinates;
import com.example.springFloorPlan.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorPlanService {

    private final FloorRepository floorRepository;

    @Autowired
    public FloorPlanService(FloorRepository floorRepository) {
        this.floorRepository = floorRepository;
    }

    public Floor_coordinates findById(Long id){
        return floorRepository.getOne(id);

    }
    public List<Floor_coordinates> findAll(){
        return floorRepository.findAll();
    }
    public void savePlan(Floor_coordinates floor_coordinates){
        floorRepository.save(floor_coordinates);
    }
    public void deleteById(Long id){
        floorRepository.deleteById(id);
    }
}
