package ru.veretennikov.restaurants.service;

import ru.veretennikov.restaurants.domain.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant get(Restaurant id);
    List<Restaurant> getAll();
    Restaurant save(Restaurant restaurant);
    Restaurant delete(Restaurant restaurant);
}
