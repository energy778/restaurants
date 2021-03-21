package ru.veretennikov.restaurants.domain;

import java.time.LocalDateTime;

public class RestaurantRating {

    private Long userId;
    private Long restaurantId;
    private LocalDateTime ratingDate;
    private Byte rating;

}
