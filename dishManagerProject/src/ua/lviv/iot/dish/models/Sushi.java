package ua.lviv.iot.dish.models;

public class Sushi extends Dish {

    private int numberOfSushi;

    public Sushi() {
    }

    public Sushi(TypeOfMenu typeOfMenu, String currency, double price,
            String name, Temperature temperature, double weigh,
            LevelOfSpicy levelOfSpicy) {
        super(typeOfMenu, currency, price, name, temperature, weigh,
                levelOfSpicy);
    }

    public int getNumberOfSushi() {
        return numberOfSushi;
    }

    public void setNumberOfSushi(int numberOfSushi) {
        this.numberOfSushi = numberOfSushi;
    }

    @Override
    public String toString() {
        return "Sushi [typeOfMenu=" + getTypeOfMenu() + ", currency="
                + getCurrency() + ", price=" + getPrice() + ", name="
                + getName() + ", temperature=" + getTemperature() + ", weigh="
                + getWeigh() + ", levelOfSpicy=" + getLevelOfSpicy() + "]";
    }
}