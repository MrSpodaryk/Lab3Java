package ua.lviv.iot.testdb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ua.lviv.iot.dish.models.LevelOfSpicy;
import ua.lviv.iot.dish.models.Temperature;
import ua.lviv.iot.dish.models.TypeOfMenu;



@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private TypeOfMenu typeOfMenu;
    private String currency;
    private double price;
    private String name;
    private Temperature temperature;
    private double weigh;
    private LevelOfSpicy levelOfSpicy;

    public Dish() {
    }

    public Dish(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        this.typeOfMenu = typeOfMenu;
        this.currency = currency;
        this.price = price;
        this.name = name;
        this.temperature = temperature;
        this.weigh = weigh;
        this.levelOfSpicy = levelOfSpicy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public final TypeOfMenu getTypeOfMenu() {
        return typeOfMenu;
    }

    public final void setTypeOfMenu(TypeOfMenu typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
    }

    public final String getCurrency() {
        return currency;
    }

    public final void setCurrency(String currency) {
        this.currency = currency;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Temperature getTemperature() {
        return temperature;
    }

    public final void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public final double getWeigh() {
        return weigh;
    }

    public final void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public final LevelOfSpicy getLevelOfSpicy() {
        return levelOfSpicy;
    }

    public final void setLevelOfSpicy(LevelOfSpicy levelOfSpicy) {
        this.levelOfSpicy = levelOfSpicy;
    }
    
    @Override
    public String toString() {
        return "Dish [typeOfMenu=" + typeOfMenu + ", currency=" + currency
                + ", price=" + price + ", name=" + name + ", temperature="
                + temperature + ", weigh=" + weigh + ", levelOfSpicy="
                + levelOfSpicy + "]";
    }

    public String getHeaders() {
        return "typeOfMenu, currency, price, name, temperature, weigh, levelOfSpicy";
    }

    public String toCSV() {
        return typeOfMenu + ", " + currency + ", " + price + ", " + name + ", "
                + temperature + ", " + weigh + ", " + levelOfSpicy;
    }
}
