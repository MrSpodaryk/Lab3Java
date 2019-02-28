package Writer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dish.models.Dish;
import ua.lviv.iot.dish.models.LevelOfSpicy;
import ua.lviv.iot.dish.models.Pizza;
import ua.lviv.iot.dish.models.Sushi;
import ua.lviv.iot.dish.models.Temperature;
import ua.lviv.iot.dish.models.TypeOfMenu;

class DishWriterTest {

    private List<Dish> dishes = new ArrayList<>();
    private DishWriter dishWriter = new DishWriter();

    @BeforeEach
    public void setUp() {

        dishes.add(new Pizza(TypeOfMenu.CHILD_MENU, "грн", 200, "Peperoni",
                Temperature.HOT, 450, LevelOfSpicy.LOW));
        dishes.add(new Pizza(TypeOfMenu.STANDART_MENU, "грн", 250, "Diablo",
                Temperature.HOT, 420, LevelOfSpicy.EXTREME));
        dishes.add(new Sushi(TypeOfMenu.STANDART_MENU, "грн", 120, "Nori",
                Temperature.COLD, 120, LevelOfSpicy.NOT_SPICY));
        dishes.add(new Sushi(TypeOfMenu.STANDART_MENU, "грн", 150, "California",
                Temperature.COLD, 320, LevelOfSpicy.NOT_SPICY));
    }

    @Test
    void test() throws IOException {
        File myFile = new File("my_dishes");
        dishWriter.writeToFile(dishes);
        Assertions.assertTrue(myFile.length() > 0);
    }

}
