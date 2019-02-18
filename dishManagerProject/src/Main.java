import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.dish.managers.DishManager;
import ua.lviv.iot.dish.models.Drinks;
import ua.lviv.iot.dish.models.LevelOfSpicy;
import ua.lviv.iot.dish.models.Pizza;
import ua.lviv.iot.dish.models.Sushi;
import ua.lviv.iot.dish.models.Temperature;
import ua.lviv.iot.dish.models.TypeOfMenu;
import ua.lviv.iot.dish.models.Dish;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        DishManager manager1 = new DishManager();

        Pizza peperoni = new Pizza(TypeOfMenu.CHILD_MENU, "грн", 200, "Peperoni", Temperature.HOT, 450,
                LevelOfSpicy.LOW);
        
        Pizza diablo = new Pizza(TypeOfMenu.STANDART_MENU, "грн", 250, "Diablo", Temperature.HOT, 420,
                LevelOfSpicy.EXTREME);

        Sushi nori = new Sushi(TypeOfMenu.STANDART_MENU, "грн", 150, "Nori", Temperature.COLD, 120,
                LevelOfSpicy.NOT_SPICY);
        
        Sushi california = new Sushi(TypeOfMenu.STANDART_MENU, "грн", 150, "California", Temperature.COLD, 320,
                LevelOfSpicy.NOT_SPICY);

        Drinks milk = new Drinks();
        milk.setName("Milk");
        milk.setCapacity(220);
        milk.setLevelOfSpicy(LevelOfSpicy.NOT_SPICY);
        milk.setPresenceOfCaffeine(false);
        milk.setTypeOfMenu(TypeOfMenu.CHILD_MENU);
        milk.setTemperature(Temperature.NORMAL);
        milk.setPresenceOfLactose(true);
        milk.setWeigh(212);
        milk.setPrice(50);
        milk.setCurrency("грн");
        
        List<Dish> newDishList = new ArrayList<>();
        newDishList.add(peperoni);
        newDishList.add(diablo);
        newDishList.add(nori);
        newDishList.add(california);
        newDishList.add(milk);

        System.out.println(manager1.findDishByTypeOfMenu(newDishList, TypeOfMenu.CHILD_MENU).toString());
        System.out.println(manager1.findDishByTypeOfMenu(newDishList, TypeOfMenu.STANDART_MENU).toString());
        System.out.println();

        System.out.println(manager1.sortDishByIncreasePrice(newDishList).toString());
        System.out.println(manager1.sortDishByDecreasePrice(newDishList).toString());
        System.out.println();

        System.out.println(manager1.sortDishByIncreaseWeigh(newDishList).toString());
        System.out.println(manager1.sortDishByDecreaseWeigh(newDishList).toString());
        System.out.println();

    }

}
