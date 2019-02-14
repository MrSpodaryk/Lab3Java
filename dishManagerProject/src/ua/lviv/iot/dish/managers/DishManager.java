package ua.lviv.iot.dish.managers;

import java.awt.List;
import java.util.ArrayList;

import ua.lviv.iot.dish.models.*;

public interface DishManager {
    
    ArrayList<Dish> dishes = new ArrayList<>();
    ArrayList findDishByTypeOfMenu(ArrayList<Dish> dishes, TypeOfMenu typeOfMenu);
    ArrayList sortDishByIncreasePrice(ArrayList<Dish> dishes, double price);
    ArrayList sortDishByDecreasePrice(ArrayList<Dish> dishes, double price);
    ArrayList sortDishByIncreaseLevelOfSpicy(ArrayList<Dish> dishes, LevelOfSpicy levelOfSpicy);
    ArrayList sortDishByDecreaseLevelOfSpicy(ArrayList<Dish> dishes, LevelOfSpicy levelOfSpicy);

    
}
