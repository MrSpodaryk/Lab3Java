package ua.lviv.iot.dish.models;

public abstract class Dish {

    private TypeOfMenu typeOfMenu;
    private String currency;
    private double price;
    private String name;
    private Temperature temperature;
    private double weigh;
    private LevelOfSpicy levelOfSpicy;

    public Dish() {

    }

    public Dish(TypeOfMenu typeOfMenu, String currency, double price, String name, Temperature temperature,
            double weigh, LevelOfSpicy levelOfSpicy) {
        this.typeOfMenu = typeOfMenu;
        this.currency = currency;
        this.price = price;
        this.name = name;
        this.temperature = temperature;
        this.weigh = weigh;
        this.levelOfSpicy = levelOfSpicy;
    }

    public TypeOfMenu getTypeOfMenu() {
        return typeOfMenu;
    }

    public void setTypeOfMenu(TypeOfMenu typeOfMenu) {
        this.typeOfMenu = typeOfMenu;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public LevelOfSpicy getLevelOfSpicy() {
        return levelOfSpicy;
    }

    public void setLevelOfSpicy(LevelOfSpicy levelOfSpicy) {
        this.levelOfSpicy = levelOfSpicy;
    }

    @Override
    public String toString() {
        return "Dish [typeOfMenu=" + typeOfMenu + ", currency=" + currency + ", price=" + price + ", name=" + name
                + ", temperature=" + temperature + ", weigh=" + weigh + ", levelOfSpicy=" + levelOfSpicy + "]";
    }

}
