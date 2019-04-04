package ua.lviv.iot.testdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.dish.models.LevelOfSpicy;
import ua.lviv.iot.dish.models.Temperature;
import ua.lviv.iot.dish.models.TypeOfMenu;

@SpringBootApplication
public class TestDbApplication {
    
    @Bean
    public CommandLineRunner demo(DishRepository repository) {
        return (args) -> {
            repository.save(new Dish(TypeOfMenu.STANDART_MENU, "грн", 150, "Pizza",
                    Temperature.HOT, 300, LevelOfSpicy.HIGH));
            repository.save(new Dish(TypeOfMenu.CHILD_MENU, "грн", 400, "Milk",
                    Temperature.NORMAL, 500, LevelOfSpicy.NOT_SPICY));
            repository.save(new Dish(TypeOfMenu.VEGETARIAN_MENU, "грн", 300, "Grass",
                    Temperature.COLD, 200, LevelOfSpicy.NOT_SPICY));
            repository.save(new Dish(TypeOfMenu.VEGETARIAN_MENU, "грн", 30, "Gra",
                    Temperature.COLD, 200, LevelOfSpicy.NOT_SPICY));
            
            repository.findAll().forEach(dishes -> System.out.println(dishes));
        };
    }
    
    public static void main(String[] args) {
        SpringApplication.run(TestDbApplication.class, args);
    }
}
