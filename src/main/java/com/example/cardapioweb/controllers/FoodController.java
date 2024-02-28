package com.example.cardapioweb.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapioweb.entities.Food;
import com.example.cardapioweb.entities.FoodDto;
import com.example.cardapioweb.services.FoodService;

@RestController
@RequestMapping(value = "foods")
public class FoodController {

    @Autowired
    private FoodService service;

    @GetMapping
    public ResponseEntity<List<FoodDto>> findAll() {
        List<FoodDto> foodList = service.findAll().stream().map(FoodDto::new).toList();
        return ResponseEntity.ok(foodList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodDto> findById(@PathVariable Long id) {
        Food foundFood = service.findById(id);
        FoodDto foodDto = new FoodDto(foundFood);
        return ResponseEntity.ok(foodDto);
    }

    @PostMapping
    public ResponseEntity<FoodDto> createFood(@RequestBody FoodDto foodDto) {
        Food newFood = new Food(foodDto);
        service.crateFood(newFood);
        return ResponseEntity.ok(foodDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodDto> updateFood(@PathVariable Long id, @RequestBody FoodDto foodDto) {
        Food food = new Food(foodDto);
        service.updateFood(id, food);
        return ResponseEntity.ok(foodDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<FoodDto>> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok(service.findAll().stream().map(FoodDto::new).toList());
    }

}
