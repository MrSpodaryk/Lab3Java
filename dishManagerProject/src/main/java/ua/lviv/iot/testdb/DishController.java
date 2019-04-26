package ua.lviv.iot.testdb;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dish")
public class DishController {
    
    @Autowired
    DishRepository repository;
    
    @GetMapping
    public Iterable<Dish> getAllDish() {
        return repository.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public Dish getDishById(@NotNull @PathVariable Integer id) {
        Optional<Dish> foundObject = repository.findById(id);
        if (foundObject.isPresent()) {
            return (Dish) foundObject.get();
        } else {
            return new Dish();
        }
    }
    
    @PostMapping
    public Dish addNewDish(@RequestBody Dish dish) {
        return repository.save(dish);
    }
    
    @PutMapping(value = "/{id}")
    public Dish updateDish(@RequestBody Dish updateDish, 
            @PathVariable Integer id) {
        Optional<Dish> foundObject = repository.findById(id);

        if (foundObject.isPresent()) {
            Dish dish = foundObject.get();
            dish.setTypeOfMenu(updateDish.getTypeOfMenu());
            dish.setCurrency(updateDish.getCurrency());
            dish.setPrice(updateDish.getPrice());
            dish.setName(updateDish.getName());
            dish.setTemperature(updateDish.getTemperature());
            dish.setWeigh(updateDish.getWeigh());
            dish.setLevelOfSpicy(updateDish.getLevelOfSpicy());
            return dish;
        } else {
            return repository.save(updateDish);
        }
    }
    
    @DeleteMapping(value = "/{id}")
    public void deleteDish(@PathVariable Integer id) {
        repository.deleteById(id);
    }
    
}
