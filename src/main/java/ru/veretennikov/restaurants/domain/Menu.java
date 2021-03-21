package ru.veretennikov.restaurants.domain;

import java.time.LocalDate;
import java.util.List;

public class Menu {

    private Long id;
    private String restaurantId;
    private LocalDate date;
    private List<MenuItem> items;

}
