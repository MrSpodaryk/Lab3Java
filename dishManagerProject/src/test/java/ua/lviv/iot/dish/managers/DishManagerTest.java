package ua.lviv.iot.dish.managers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dish.models.Dish;
import ua.lviv.iot.dish.models.Drinks;
import ua.lviv.iot.dish.models.LevelOfSpicy;
import ua.lviv.iot.dish.models.Pizza;
import ua.lviv.iot.dish.models.Sushi;
import ua.lviv.iot.dish.models.Temperature;
import ua.lviv.iot.dish.models.TypeOfMenu;
import ua.lviv.iot.dish.models.Wok;
import ua.lviv.iot.dish.managers.DishManager;

class DishManagerTest {

    private List<Dish> dishes = new ArrayList<>();

    private DishManager dishManager = new DishManager();

    @BeforeEach
    public void setUp() {
        dishes.add(new Pizza(TypeOfMenu.CHILD_MENU, "грн", 200, "Peperoni",
                Temperature.HOT, 450, LevelOfSpicy.LOW));
        dishes.add(new Wok(TypeOfMenu.STANDART_MENU, "грн", 250, "Diablo",
                Temperature.HOT, 420, LevelOfSpicy.EXTREME));
        dishes.add(new Sushi(TypeOfMenu.STANDART_MENU, "грн", 120, "Nori",
                Temperature.COLD, 120, LevelOfSpicy.NOT_SPICY));
        dishes.add(new Drinks(TypeOfMenu.STANDART_MENU, "грн", 150,
                "California", Temperature.COLD, 320, LevelOfSpicy.NOT_SPICY));
        dishes.add(new Dish(TypeOfMenu.STANDART_MENU, "грн", 400, "California",
                Temperature.COLD, 500, LevelOfSpicy.NOT_SPICY));
    }

    @Test
    void testFindDishByTypeOfMenu() {
        Assertions.assertEquals(1, dishManager
                .findDishByTypeOfMenu(dishes, TypeOfMenu.CHILD_MENU).size());
        Assertions.assertEquals(4, dishManager
                .findDishByTypeOfMenu(dishes, TypeOfMenu.STANDART_MENU).size());
    }

    @Test
    void testSortDishByIncreasePrice() {
        dishManager.sortDishByIncreasePrice(dishes);
        Assertions.assertEquals(120, dishes.get(0).getPrice());
        Assertions.assertEquals(150, dishes.get(1).getPrice());
        Assertions.assertEquals(200, dishes.get(2).getPrice());
        Assertions.assertEquals(250, dishes.get(3).getPrice());
        Assertions.assertEquals(400, dishes.get(4).getPrice());
    }

    @Test
    void testSortDishByDecreasePrice() {
        dishManager.sortDishByDecreasePrice(dishes);
        Assertions.assertEquals(120, dishes.get(4).getPrice());
        Assertions.assertEquals(150, dishes.get(3).getPrice());
        Assertions.assertEquals(200, dishes.get(2).getPrice());
        Assertions.assertEquals(250, dishes.get(1).getPrice());
        Assertions.assertEquals(400, dishes.get(0).getPrice());
    }

    @Test
    void testSortDishByIncreaseWeigh() {
        dishManager.sortDishByIncreaseWeigh(dishes);
        Assertions.assertEquals(120, dishes.get(0).getWeigh());
        Assertions.assertEquals(320, dishes.get(1).getWeigh());
        Assertions.assertEquals(420, dishes.get(2).getWeigh());
        Assertions.assertEquals(450, dishes.get(3).getWeigh());
        Assertions.assertEquals(500, dishes.get(4).getWeigh());
    }

    @Test
    void testSortDishByDecreaseWeigh() {
        dishManager.sortDishByDecreaseWeigh(dishes);
        Assertions.assertEquals(120, dishes.get(4).getWeigh());
        Assertions.assertEquals(320, dishes.get(3).getWeigh());
        Assertions.assertEquals(420, dishes.get(2).getWeigh());
        Assertions.assertEquals(450, dishes.get(1).getWeigh());
        Assertions.assertEquals(500, dishes.get(0).getWeigh());
    }

    @Test
    void testToString() {
        for (int index = 0; index < dishes.size(); index++) {
            if (dishes.get(index).toString().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }

    @Test
    void testGetHeaders() {
        for (int index = 0; index < dishes.size(); index++) {
            if (dishes.get(index).getHeaders().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }

    @Test
    void testToCSV() {
        for (int index = 0; index < dishes.size(); index++) {
            if (dishes.get(index).toCSV().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }
}
