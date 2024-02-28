package com.example.cardapioweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardapioweb.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
