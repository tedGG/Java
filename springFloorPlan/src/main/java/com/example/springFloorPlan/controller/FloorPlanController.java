package com.example.springFloorPlan.controller;

import com.example.springFloorPlan.Service.FloorPlanService;
import com.example.springFloorPlan.model.Floor_coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
public class FloorPlanController {

    private final FloorPlanService floorPlanService;

    @Autowired
    public FloorPlanController(@Valid FloorPlanService floorPlanService) {
        this.floorPlanService = floorPlanService;
    }

    @GetMapping("/floor_plan")
    public String findAll(Model model){
        List<Floor_coordinates> floor_coordinates = floorPlanService.findAll();
        model.addAttribute("floor_coordinates", floor_coordinates);
        return "floor_plan_list";
    }

    @GetMapping("/floor_plan_create")
    public String createFloorPlanForm(Floor_coordinates floor_coordinates){
        return "floor_plan_create";
    }
    @PostMapping("/floor_plan_create")
    public String createFloorPlan(@Valid Floor_coordinates floor_coordinates, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            System.out.println("code is valid");
            return "/plan_create";
        }else System.out.println("code is not valid");
        floorPlanService.savePlan(floor_coordinates);
        return "redirect:/floor_plan";
    }
    @GetMapping("/plan_delete/{id}")
    public String deletePlan(@PathVariable("id") Long id){
        floorPlanService.deleteById(id);
        return "redirect:/floor_plan";

    }
    @GetMapping("/plan_update/{id}")
    public String updatePlanForm(@PathVariable("id") Long id,Model model){
        Floor_coordinates floor_coordinates = floorPlanService.findById(id);
        model.addAttribute("floor_coordinates",floor_coordinates);
        return "/floor_plan_update";
    }
    @PostMapping("/plan_update")
    public String updatePlan(@Valid Floor_coordinates floor_coordinates, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "floor_plan_update";
        }else System.out.println("code is not valid");

        floorPlanService.savePlan(floor_coordinates);
        return "redirect:/floor_plan";
    }

    @GetMapping("/plan_view/{id}")
    public String createPlanView(@PathVariable("id") Long id, Model model){
        Floor_coordinates floor_coordinates = floorPlanService.findById(id);
        model.addAttribute("floor_coordinates", floor_coordinates);
        return "floor_plan_view";
    }



}
