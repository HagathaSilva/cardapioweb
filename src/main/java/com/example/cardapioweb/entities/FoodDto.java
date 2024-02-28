package com.example.cardapioweb.entities;

public record FoodDto(String title, String image, Double price) {
    public FoodDto(Food food) {
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}