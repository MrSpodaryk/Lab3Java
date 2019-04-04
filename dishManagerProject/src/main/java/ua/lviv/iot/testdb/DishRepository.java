package ua.lviv.iot.testdb;

import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Integer> {
    
}
