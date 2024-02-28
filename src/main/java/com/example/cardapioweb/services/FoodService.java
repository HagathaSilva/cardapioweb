package com.example.cardapioweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cardapioweb.entities.Food;
import com.example.cardapioweb.repositories.FoodRepository;

@Service
public class FoodService {

    @Autowired
    FoodRepository repository;

    public List<Food> findAll() {
        return repository.findAll();
    }

    public Food findById(Long id) {
        return repository.findById(id).get();
    }

    public Food crateFood(Food food) {
        repository.save(food);
        return food;
    }

    public Food updateFood(Long id, Food food) {
        Food foundFood = repository.findById(id).get();
        foundFood.setTitle(food.getTitle());
        foundFood.setImage(food.getImage());
        foundFood.setPrice(food.getPrice());
        return repository.save(foundFood);
    }

    public List<Food> deleteById(Long id) {
        repository.deleteById(id);
        return findAll();
    }

}
