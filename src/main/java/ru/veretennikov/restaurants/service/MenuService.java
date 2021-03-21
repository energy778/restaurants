package ru.veretennikov.restaurants.service;

import ru.veretennikov.restaurants.domain.Menu;

import java.util.List;

public interface MenuService {
    Menu get(Menu id);
    List<Menu> getAll();
    Menu save(Menu menu);
    Menu delete(Menu menu);
}
