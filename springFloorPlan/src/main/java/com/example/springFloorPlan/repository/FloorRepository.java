package com.example.springFloorPlan.repository;

import com.example.springFloorPlan.model.Floor_coordinates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FloorRepository extends JpaRepository<Floor_coordinates, Long> {

}
