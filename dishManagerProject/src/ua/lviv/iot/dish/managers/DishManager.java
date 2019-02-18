package ua.lviv.iot.dish.managers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import ua.lviv.iot.dish.models.*;

public class DishManager  {
    
    private List<Dish> dishes = new ArrayList<>();
    
    public DishManager() { 
    }
    
    public DishManager(List<Dish> dishes) {
        this.dishes = dishes;
    }
    
    public List<Dish> findDishByTypeOfMenu(List<Dish> dishes, TypeOfMenu typeOfMenu){
        List <Dish> selectedDishes = dishes.stream()
                .filter(o1 -> o1.getTypeOfMenu().equals(typeOfMenu))
                .collect(Collectors.toList());
        return selectedDishes;
    }
    
    public List<Dish> sortDishByIncreasePrice(List<Dish> dishes) {
        dishes.sort((o1, o2) -> (int)o1.getPrice() - (int)o2.getPrice());
        return dishes;
    }
    
    public List<Dish> sortDishByDecreasePrice(List<Dish> dishes) {
        dishes.sort((o1, o2) -> (int)o2.getPrice() - (int)o1.getPrice());
        return dishes;
    }
    
    public List<Dish> sortDishByIncreaseWeigh(List<Dish> dishes) {
        dishes.sort((o1, o2) -> (int)o1.getWeigh() - (int)o2.getWeigh());
        return dishes;
    }
    
    public List<Dish> sortDishByDecreaseWeigh(List<Dish> dishes) {
        dishes.sort((o1, o2) -> (int)o2.getWeigh() - (int)o1.getWeigh());
        return dishes;
    }

    
}
